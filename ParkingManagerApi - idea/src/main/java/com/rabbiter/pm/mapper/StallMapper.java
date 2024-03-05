package com.rabbiter.pm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.pm.domain.Stall;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-22
 */
@Repository
public interface StallMapper extends BaseMapper<Stall> {

    int setStallOrg(@Param("sid")Integer sid);

    IPage<Stall> getStallAll(Page<Stall> page, @Param("nike")String nike, @Param("card")String card);
}
