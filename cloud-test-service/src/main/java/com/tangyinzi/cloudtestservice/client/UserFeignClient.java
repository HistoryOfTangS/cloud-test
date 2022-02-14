package com.tangyinzi.cloudtestservice.client;

import com.tangyinzi.cloudtestservice.client.impl.UserFeignClientImpl;
import com.tangyinzi.models.model.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient(value = "service-base", name = "service-base", url = "http://localhost:31091")
@FeignClient(name = "cloud-test-user", fallback = UserFeignClientImpl.class)
public interface UserFeignClient {

    @RequestMapping(value = "/cloudtestuser/sys-user/list", method = RequestMethod.GET)
    public List<SysUser> getUserList();
}
