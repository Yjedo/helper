package com.yyd.helper.user.service.impl;

import com.yyd.helper.user.entity.UserStatus;
import com.yyd.helper.user.mapper.UserStatusMapper;
import com.yyd.helper.user.service.IUserStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户状态表 服务实现类
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Service
public class UserStatusServiceImpl extends ServiceImpl<UserStatusMapper, UserStatus> implements IUserStatusService {

}
