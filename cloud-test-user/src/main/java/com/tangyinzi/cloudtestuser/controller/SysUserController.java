package com.tangyinzi.cloudtestuser.controller;


import com.tangyinzi.cloudtestuser.model.SysUser;
import com.tangyinzi.cloudtestuser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@RestController
@RequestMapping("/cloudtestuser/sys-user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<SysUser> getUserList() throws InterruptedException {
        Thread.sleep(10000);
        return sysUserService.list();
    }

}

