package com.tangyinzi.cloudtestuser.service;

import com.tangyinzi.cloudtestuser.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
public interface SysUserService extends IService<SysUser> {

    List<SysUser> getUserList();
}
