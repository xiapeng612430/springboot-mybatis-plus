package com.ims.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 01:35
 */
@Data
@TableName("user")
public class User {
    @TableId(value = "id")
    private Long userId;
    @TableField("name")
    private String realName;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

}
