package com.yyd.helper.user.service.impl;

import com.yyd.helper.user.entity.User;
import com.yyd.helper.user.mapper.UserMapper;
import com.yyd.helper.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
