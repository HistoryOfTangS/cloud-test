package com.tangyinzi.cloudtestuser.mapper;

import com.tangyinzi.cloudtestuser.modle.SysRequestPath;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysRequestPathMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRequestPath record);

    int insertSelective(SysRequestPath record);

    SysRequestPath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRequestPath record);

    int updateByPrimaryKey(SysRequestPath record);
}