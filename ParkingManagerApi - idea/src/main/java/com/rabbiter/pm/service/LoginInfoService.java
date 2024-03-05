package com.rabbiter.pm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.pm.domain.LoginInfo;
import com.rabbiter.pm.domain.vo.LoginInfoVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
public interface LoginInfoService extends IService<LoginInfo> {

    Object getLoginInfoList(LoginInfoVo loginInfoVo);
}
