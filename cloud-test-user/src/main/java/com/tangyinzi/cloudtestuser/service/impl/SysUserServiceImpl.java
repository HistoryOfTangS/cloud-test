package com.tangyinzi.cloudtestuser.service.impl;

import com.tangyinzi.cloudtestuser.model.SysUser;
import com.tangyinzi.cloudtestuser.mapper.SysUserMapper;
import com.tangyinzi.cloudtestuser.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public List<SysUser> getUserList() {
        return null;
    }
}
