package com.wanshu.sys.mapper;

import com.wanshu.sys.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    int checkRoleCanDelete(@Param("roleId") Long roleId);

    List<SysRole> queryByUserId(Long userId);
}
