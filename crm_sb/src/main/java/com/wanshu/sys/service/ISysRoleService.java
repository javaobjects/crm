package com.wanshu.sys.service;

import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wanshu.sys.model.SysRoleQueryDTO;

import java.util.List;

/**
 * <p>
 * 角色 服务类
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
public interface ISysRoleService extends IService<SysRole> {

    PageUtils queryPage(SysRoleQueryDTO queryDTO);

    void saveOrUpdateRole(SysRole role);

    void update(SysRole role);

    void deleteBatch(Long[] roleIds);

    boolean checkRoleName(String roleName);

    boolean deleteRoleById(Long roleId);

    List<SysRole> queryByUserId(Long userId);
}
