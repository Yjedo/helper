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
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户明细表
 * </p>
 *
 * @author yyd
 * @since 2023-03-08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("helper_user_detail")
@ApiModel(value = "UserDetail对象", description = "用户明细表")
public class UserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("用户头像")
    private String avatar;

    @ApiModelProperty("领取任务数目")
    private Integer getTaskNum;

    @ApiModelProperty("完成任务数目")
    private Integer finishTaskNum;

    @ApiModelProperty("用户账号余额")
    private Integer balance;

    @ApiModelProperty("逻辑删除标志")
    private Boolean isDeleted;

    @ApiModelProperty("注册时间")
    private LocalDate createTime;

    @ApiModelProperty("用户当前状态")
    private Integer statusId;


}
