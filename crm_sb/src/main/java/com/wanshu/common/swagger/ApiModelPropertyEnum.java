package com.wanshu.common.swagger;


import com.wanshu.common.model.IDict;

import java.lang.annotation.*;

/**
 * Swagger文档注释枚举翻译
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModelPropertyEnum {

    /**
     * 属性对应的字段枚举
     */
    Class<? extends IDict<?>> dictEnum();

}
