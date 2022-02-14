package com.tangyinzi.cloudtestservice.service.impl;

import com.tangyinzi.cloudtestservice.model.Country;
import com.tangyinzi.cloudtestservice.mapper.CountryMapper;
import com.tangyinzi.cloudtestservice.service.CountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements CountryService {

}
