package com.wanshu.sys.service;

import com.wanshu.common.util.PageUtils;
import com.wanshu.sys.entity.SysLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wanshu.sys.model.SysLogQueryDTO;

/**
 * <p>
 * 系统日志 服务类
 * </p>
 *
 * @author xianxian
 * @since 2022-11-27
 */
public interface ISysLogService extends IService<SysLog> {

    PageUtils listPage(SysLogQueryDTO dto);
}
