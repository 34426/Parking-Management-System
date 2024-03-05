package com.rabbiter.pm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pm.domain.StallType;
import com.rabbiter.pm.mapper.StallTypeMapper;
import com.rabbiter.pm.service.StallTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-30
 */
@Service
public class StallTypeServiceImpl extends ServiceImpl<StallTypeMapper, StallType> implements StallTypeService {
    @Resource
    private StallTypeMapper stallTypeMapper;

}
