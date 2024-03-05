package com.rabbiter.pm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.pm.domain.StallRes;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author rabbiter
 * @date 2023/3/23
 */
public interface StallResMapper extends BaseMapper<StallRes> {

    List<StallRes> getAllStallRes(@Param("person")String person);

    IPage<StallRes> getAllListStallRes(Page<StallRes> page, @Param("person")String person,
                                       @Param("inTime")LocalDateTime inTime,
                                       @Param("outTime")LocalDateTime outTime,
                                       @Param("stallArea")String stallArea);
}
