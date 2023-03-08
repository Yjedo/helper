package com.yyd.helper.user.service.impl;

import com.yyd.helper.user.entity.UserRole;
import com.yyd.helper.user.mapper.UserRoleMapper;
import com.yyd.helper.user.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户权限表 服务实现类
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
