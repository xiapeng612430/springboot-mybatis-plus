package com.ims.mp.entity;

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
    @TableId
    private Long userId;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

}
