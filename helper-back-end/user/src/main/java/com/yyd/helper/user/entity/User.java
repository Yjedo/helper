package com.yyd.helper.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("helper_user")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码(加密后的)")
    private String password;

    @ApiModelProperty("用户权限")
    private Integer roleId;

    @ApiModelProperty("用户具体信息")
    private Integer userDetailId;

    @ApiModelProperty("逻辑删除标志")
    private Boolean isDeleted;

    @ApiModelProperty("注册时间")
    private LocalDate createTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", userDetailId=" + userDetailId +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }
}
