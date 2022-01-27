/*
 * Copyright (c) 2014-2020 杭州派迩信息技术有限公司 All Rights Reserved.
 * ProjectName: micro_server
 * ModuleName: micro_server
 * FileName: SysPermissionServiceImpl.java
 * Author: tangyiner
 * Date: 2020/09/07 10:19:07
 * Version: 1.0
 * LastModified: 2020/09/07 10:19:07
 */

package com.tangyinzi.cloudtestuser.service.impl;

import com.tangyinzi.cloudtestuser.mapper.SysPermissionMapper;
import com.tangyinzi.cloudtestuser.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: SysPermissionServiceImpl
 * @description: 权限表服务实现类
 * @author: tangyiner
 * @date: 2020/09/07 10:19:07
 * @since: 1.0
 */

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

}
