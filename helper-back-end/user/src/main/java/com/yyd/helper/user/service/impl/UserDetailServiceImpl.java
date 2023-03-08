package com.yyd.helper.user.service.impl;

import com.yyd.helper.user.entity.UserDetail;
import com.yyd.helper.user.mapper.UserDetailMapper;
import com.yyd.helper.user.service.IUserDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户明细表 服务实现类
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Service
public class UserDetailServiceImpl extends ServiceImpl<UserDetailMapper, UserDetail> implements IUserDetailService {

}
