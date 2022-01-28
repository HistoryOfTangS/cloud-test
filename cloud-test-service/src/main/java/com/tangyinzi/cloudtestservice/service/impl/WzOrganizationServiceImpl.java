package com.tangyinzi.cloudtestservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tangyinzi.cloudtestservice.model.WzOrganization;
import com.tangyinzi.cloudtestservice.mapper.WzOrganizationMapper;
import com.tangyinzi.cloudtestservice.service.WzOrganizationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 组织机构名称 服务实现类
 * </p>
 *
 * @author tangyinzi
 * @since 2022-01-28
 */
@Service
public class WzOrganizationServiceImpl extends ServiceImpl<WzOrganizationMapper, WzOrganization> implements WzOrganizationService {

    @Autowired
    private WzOrganizationMapper wzOrganizationMapper;

    @Override
    public List<WzOrganization> getOrganizationList() {
        return wzOrganizationMapper.getOrganizationList();
    }
}
