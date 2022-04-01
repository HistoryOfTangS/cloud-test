package com.tangyinzi.cloudtestservice.controller;


import com.tangyinzi.cloudtestservice.client.UserFeignClient;
import com.tangyinzi.cloudtestservice.model.City;
import com.tangyinzi.cloudtestservice.model.WzOrganization;
import com.tangyinzi.cloudtestservice.service.CityService;
import com.tangyinzi.models.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Autowired
    private CityService cityService;

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<City> getCityList() {
        return cityService.list();
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public List<SysUser> getUserById(@RequestParam Integer id) {
        return userFeignClient.getUserList();
        //Map<Integer, List<SysUser>> listMap = userList.stream().collect(Collectors.groupingBy(SysUser::getId));
        //return listMap.get(id);
    }
}

