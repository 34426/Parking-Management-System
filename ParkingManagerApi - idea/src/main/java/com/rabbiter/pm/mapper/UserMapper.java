package com.rabbiter.pm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbiter.pm.domain.User;
import com.rabbiter.pm.domain.vo.DateType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-21
 */
public interface UserMapper extends BaseMapper<User> {

    List<DateType> getUserDataType(@Param("person")String person);

    List<DateType> getUserDataMoney(@Param("person")String person);
}
