package com.wanshu.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanshu.common.annotation.SystemLog;
import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysRole;
import com.wanshu.sys.mapper.SysRoleMapper;
import com.wanshu.sys.model.SysRoleQueryDTO;
import com.wanshu.sys.service.ISysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public PageUtils queryPage(SysRoleQueryDTO queryDTO) {
        QueryWrapper<SysRole> wrapper = new QueryWrapper<SysRole>().like(
                StringUtils.isNotEmpty(queryDTO.getRoleName()),"role_name",queryDTO.getRoleName()
        );
        Page<SysRole> page = this.page(queryDTO.page(), wrapper);

        return new PageUtils(page);
    }

    @SystemLog("添加或更新角色")
    @Override
    public void saveOrUpdateRole(SysRole role) {
        // 判断 角色编号是否存在，如果存在就走更新的逻辑否则新增数据
        if(role.getRoleId() != null && role.getRoleId() != 0){
            // 表示更新操作
            this.update(role);

        }else{
            this.saveRole(role);
        }
    }

    public void saveRole(SysRole role){
        role.setCreateTime(LocalDateTime.now());
        this.save(role);
    }

    @Override
    public void update(SysRole role) {
        this.baseMapper.updateById(role);
    }

    @Override
    public void deleteBatch(Long[] roleIds) {

    }

    /**
     *
     * @param roleName
     * @return
     *    true 存在
     *    false 不存在
     */
    @Override
    public boolean checkRoleName(String roleName) {
        if(StringUtils.isEmpty(roleName)){
            return false;
        }
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<SysRole>().eq("role_name",roleName);
        int count = this.count(queryWrapper);
        return count > 0;
    }

    @SystemLog("删除角色")
    @Override
    public boolean deleteRoleById(Long roleId) {
        // 删除角色信息
        // 如果这个角色分配给了 用户或者角色绑定了菜单。那么都不允许删除角色
        // 查看该角色是否分配给了用户
        int count = this.baseMapper.checkRoleCanDelete(roleId);
        if(count == 0){
            // 表示可以删除
            this.baseMapper.deleteById(roleId);
        }
        return count == 0;
    }

    @Override
    public List<SysRole> queryByUserId(Long userId) {
        return sysRoleMapper.queryByUserId(userId);
    }
}
