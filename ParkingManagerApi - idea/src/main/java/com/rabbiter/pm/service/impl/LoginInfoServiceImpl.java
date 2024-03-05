package com.rabbiter.pm.service.impl;

import cn.dev33.satoken.util.SaFoxUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pm.domain.LoginInfo;
import com.rabbiter.pm.domain.Stall;
import com.rabbiter.pm.domain.vo.LoginInfoVo;
import com.rabbiter.pm.mapper.LoginInfoMapper;
import com.rabbiter.pm.service.LoginInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
@Service
public class LoginInfoServiceImpl extends ServiceImpl<LoginInfoMapper, LoginInfo> implements LoginInfoService {
    @Resource
    private LoginInfoMapper loginInfoMapper;

    @Override
    public Object getLoginInfoList(LoginInfoVo loginInfoVo) {
        Page<LoginInfo> page = new Page<>(loginInfoVo.getPagenum(),loginInfoVo.getPageSize());
        //查询条件
        QueryWrapper<LoginInfo> wrapper =new QueryWrapper<>();
        if(!SaFoxUtil.isEmpty(loginInfoVo.getPerson())){
            wrapper.like("person",loginInfoVo.getPerson());
        }
        if(!SaFoxUtil.isEmpty(loginInfoVo.getIp())){
            wrapper.like("ip",loginInfoVo.getIp());
        }
        return loginInfoMapper.selectPage(page,wrapper);
    }
}
