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
 * 用户状态表
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("helper_user_status")
@ApiModel(value = "UserStatus对象", description = "用户状态表")
public class UserStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("状态名")
    private String statusName;

    @ApiModelProperty("状态描述")
    private String statusDescribe;


}
