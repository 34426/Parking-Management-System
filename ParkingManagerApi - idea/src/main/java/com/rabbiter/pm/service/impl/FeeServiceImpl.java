package com.rabbiter.pm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pm.domain.Fee;
import com.rabbiter.pm.mapper.FeeMapper;
import com.rabbiter.pm.service.FeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
@Service
public class FeeServiceImpl extends ServiceImpl<FeeMapper, Fee> implements FeeService {

}
