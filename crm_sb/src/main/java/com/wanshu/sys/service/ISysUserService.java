package com.wanshu.sys.service;

import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wanshu.sys.model.SysUserQueryDTO;

import java.util.List;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
public interface ISysUserService extends IService<SysUser> {

    List<SysUser> queryByUserName(String username);

    PageUtils queryPage(SysUserQueryDTO dto);
}
