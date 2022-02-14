package com.tangyinzi.cloudtestservice.client.impl;

import com.tangyinzi.cloudtestservice.client.UserFeignClient;
import com.tangyinzi.models.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFeignClientImpl implements UserFeignClient {

    private static Logger log = LoggerFactory.getLogger(UserFeignClientImpl.class);

    @Override
    public List<SysUser> getUserList() {
        log.info("熔断！！！！");
        return new ArrayList<SysUser>();
    }
}
