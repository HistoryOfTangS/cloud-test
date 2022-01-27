package com.tangyinzi.cloudtestuser.mapper;

import com.tangyinzi.cloudtestuser.modle.SysUserRoleRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserRoleRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRoleRelation record);

    int insertSelective(SysUserRoleRelation record);

    SysUserRoleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRoleRelation record);

    int updateByPrimaryKey(SysUserRoleRelation record);
}