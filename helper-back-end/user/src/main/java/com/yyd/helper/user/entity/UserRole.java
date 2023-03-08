package com.yyd.helper.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户权限表
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("helper_user_role")
@ApiModel(value = "UserRole对象", description = "用户权限表")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("角色/权限名")
    private String roleName;

    @ApiModelProperty("权限等级(1游客, 2普通用户, 3管理员, 4超级管理员)")
    private Integer roleLevel;


}
