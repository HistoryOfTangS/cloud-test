package com.tangyinzi.cloudtestservice.mapper;

import com.tangyinzi.cloudtestservice.model.WzOrganization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 组织机构名称 Mapper 接口
 * </p>
 *
 * @author tangyinzi
 * @since 2022-01-28
 */
@Mapper
public interface WzOrganizationMapper extends BaseMapper<WzOrganization> {

    List<WzOrganization> getOrganizationList();

}
