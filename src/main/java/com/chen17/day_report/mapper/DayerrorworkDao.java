package com.chen17.day_report.mapper;

import com.chen17.day_report.domain.Dayerrorwork;

public interface DayerrorworkDao {
    int deleteByPrimaryKey(Integer errortableId);

    int insert(Dayerrorwork record);

    int insertSelective(Dayerrorwork record);

    Dayerrorwork selectByPrimaryKey(Integer errortableId);

    int updateByPrimaryKeySelective(Dayerrorwork record);

    int updateByPrimaryKey(Dayerrorwork record);
}