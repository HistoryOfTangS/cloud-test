package com.tangyinzi.cloudtestservice.controller;


import com.tangyinzi.cloudtestservice.client.UserFeignClient;
import com.tangyinzi.cloudtestservice.model.City;
import com.tangyinzi.cloudtestservice.model.WzOrganization;
import com.tangyinzi.cloudtestservice.service.CityService;
import com.tangyinzi.models.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@RestController
@RequestMapping("/cloudtestservice/city")
public class CityController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CityService cityService;

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<City> getCityList() {
        return cityService.list();
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public List<SysUser> getUserById(@RequestParam Integer id) {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = this.discoveryClient.getInstances(service);
            for (ServiceInstance se : instances) {
                String serviceId = se.getServiceId();
                logger.info("serviceId" + serviceId);
                String instanceId = se.getInstanceId();
                logger.info("instanceId:" + instanceId);
            }
        }
        return userFeignClient.getUserList();
        //Map<Integer, List<SysUser>> listMap = userList.stream().collect(Collectors.groupingBy(SysUser::getId));
        //return listMap.get(id);
    }
}

