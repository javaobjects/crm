package com.wanshu.sys.controller;

import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysLog;
import com.wanshu.sys.model.SysLogQueryDTO;
import com.wanshu.sys.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 系统日志 前端控制器
 * </p>
 *
 * @author xianxian
 * @since 2022-11-27
 */

@Controller
@RequestMapping("/sys/sysLog")
public class SysLogController {

    @Autowired
    private ISysLogService sysLogService;

    @GetMapping("/list")
    public PageUtils list(SysLogQueryDTO dto){
        PageUtils pageUtils = sysLogService.listPage(dto);
        return pageUtils;
    }
}
