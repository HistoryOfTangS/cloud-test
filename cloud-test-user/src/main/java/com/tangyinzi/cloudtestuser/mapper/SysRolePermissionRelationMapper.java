package com.tangyinzi.cloudtestuser.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysRolePermissionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermissionRelationMapper record);

    int insertSelective(SysRolePermissionRelationMapper record);

    SysRolePermissionRelationMapper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRolePermissionRelationMapper record);

    int updateByPrimaryKey(SysRolePermissionRelationMapper record);
}
