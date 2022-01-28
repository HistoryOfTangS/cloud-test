package com.tangyinzi.cloudtestservice.controller;


import com.tangyinzi.cloudtestservice.model.WzOrganization;
import com.tangyinzi.cloudtestservice.service.WzOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 组织机构名称 前端控制器
 * </p>
 *
 * @author tangyinzi
 * @since 2022-01-28
 */
@RestController
@RequestMapping("/cloudtestservice/wz-organization")
public class WzOrganizationController {

    @Autowired
    WzOrganizationService wzOrganizationService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<WzOrganization> getOrganizationList() {
        return wzOrganizationService.getOrganizationList();
    }
}

