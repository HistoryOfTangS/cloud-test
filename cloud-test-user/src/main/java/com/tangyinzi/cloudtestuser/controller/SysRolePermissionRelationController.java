/*
 * Copyright (c) 2014-2020 杭州派迩信息技术有限公司 All Rights Reserved.
 * ProjectName: micro_server
 * ModuleName: micro_server
 * FileName: SysRolePermissionRelationController.java
 * Author: tangyiner
 * Date: 2020/09/07 10:19:07
 * Version: 1.0
 * LastModified: 2020/09/07 10:19:07
 */

package com.tangyinzi.cloudtestuser.controller;

import com.tangyinzi.cloudtestuser.service.SysRolePermissionRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @className: SysRolePermissionRelationController
 * @description: 角色-权限关联关系表前端控制器
 * @author: tangyiner
 * @date: 2020/09/07 10:19:07
 * @since: 1.0
 */

@RestController
@Api(tags = "SysRolePermissionRelation", value = "角色-权限关联关系表管理")

@RequestMapping("/sysRolePermissionRelation")
public class SysRolePermissionRelationController {

    @Autowired
    private SysRolePermissionRelationService sysRolePermissionRelationService;

}
