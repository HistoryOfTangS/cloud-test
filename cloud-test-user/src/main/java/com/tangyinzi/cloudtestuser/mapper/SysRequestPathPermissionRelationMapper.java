package com.tangyinzi.cloudtestuser.mapper;

import com.tangyinzi.cloudtestuser.modle.SysRequestPathPermissionRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysRequestPathPermissionRelationMapper {
    int insert(SysRequestPathPermissionRelation record);

    int insertSelective(SysRequestPathPermissionRelation record);
}