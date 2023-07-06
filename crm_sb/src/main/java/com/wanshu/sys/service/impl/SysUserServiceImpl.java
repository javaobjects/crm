package com.wanshu.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanshu.common.constant.SystemConstant;
import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysUser;
import com.wanshu.sys.mapper.SysUserMapper;
import com.wanshu.sys.model.SysUserQueryDTO;
import com.wanshu.sys.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public List<SysUser> queryByUserName(String username) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(username),"username",username);
        wrapper.eq("status", SystemConstant.USER_STATUS_NORMAL);
        return this.baseMapper.selectList(wrapper);
    }

    @Override
    public PageUtils queryPage(SysUserQueryDTO dto) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.like(StringUtils.isNotBlank(dto.getUsername()),"username",dto.getUsername());
        Page<SysUser> page = this.page(dto.page(), wrapper);
        return new PageUtils(page);
    }
}
