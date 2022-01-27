/*
 * Copyright (c) 2014-2020 杭州派迩信息技术有限公司 All Rights Reserved.
 * ProjectName: micro_server
 * ModuleName: micro_server
 * FileName: SysRequestPathPermissionRelationController.java
 * Author: tangyiner
 * Date: 2020/09/07 10:19:07
 * Version: 1.0
 * LastModified: 2020/09/07 10:19:07
 */

package com.tangyinzi.cloudtestuser.controller;

import com.tangyinzi.cloudtestuser.service.SysRequestPathPermissionRelationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: SysRequestPathPermissionRelationController
 * @description: 路径权限关联表前端控制器
 * @author: tangyiner
 * @date: 2020/09/07 10:19:07
 * @since: 1.0
 */

@RestController
@Api(tags = "SysRequestPathPermissionRelation", value = "路径权限关联表管理")

@RequestMapping("/sysRequestPathPermissionRelation")
public class SysRequestPathPermissionRelationController {

    @Autowired
    private SysRequestPathPermissionRelationService sysRequestPathPermissionRelationService;

}
