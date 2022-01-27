/*
 * Copyright (c) 2014-2020 杭州派迩信息技术有限公司 All Rights Reserved.
 * ProjectName: micro_server
 * ModuleName: micro_server
 * FileName: SysRequestPathController.java
 * Author: tangyiner
 * Date: 2020/09/07 10:19:07
 * Version: 1.0
 * LastModified: 2020/09/07 10:19:07
 */

package com.tangyinzi.cloudtestuser.controller;

import com.tangyinzi.cloudtestuser.service.SysRequestPathService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @className: SysRequestPathController
 * @description: 请求路径前端控制器
 * @author: tangyiner
 * @date: 2020/09/07 10:19:07
 * @since: 1.0
 */

@RestController
@Api(tags = "SysRequestPath", value = "请求路径管理")

@RequestMapping("/sysRequestPath")
public class SysRequestPathController {

    @Autowired
    private SysRequestPathService sysRequestPathService;

}
