package com.wanshu.sys.model;

import com.wanshu.common.model.PageDTO;
import com.wanshu.sys.entity.SysUser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SysUserQueryDTO extends PageDTO {
    @ApiModelProperty("用户名称")
    private String username;
}
