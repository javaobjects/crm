package com.wanshu.sys.controller;

import com.wanshu.common.execption.BizException;
import com.wanshu.common.result.IgnoredResultWrapper;
import com.wanshu.common.result.ResultWrapper;
import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysUser;
import com.wanshu.sys.model.SysUserQueryDTO;
import com.wanshu.sys.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author xianxian
 * @since 2022-11-18
 */
@Api(tags = "系统用户",value = "SysUser")
@RestController
@RequestMapping("/sys/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @ApiOperation(value = "查询系统用户",notes = "查询用户")
    @GetMapping("/list")
    public PageUtils list(SysUserQueryDTO dto){
        return userService.queryPage(dto);
    }

}
