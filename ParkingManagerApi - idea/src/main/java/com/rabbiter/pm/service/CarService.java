package com.rabbiter.pm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.pm.domain.Car;
import com.rabbiter.pm.domain.vo.CarVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
public interface CarService extends IService<Car> {

    /**
     * 获取车辆信息
     * @param carVo 车辆实体
     * @return Object
     */
    Object getList(CarVo carVo);

    /**
     * 新增车辆信息
     * @param car 车辆信息
     * @return Object
     */
    Object addCar(Car car);
}
