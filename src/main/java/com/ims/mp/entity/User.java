package com.ims.mp.entity;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 01:35
 */
@Data
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;
    //@TableId(value = "id")
    /*
    自增策略
    @TableId(type = IdType.AUTO)
    */

    /*
    全局策略
    @TableId(type = IdType.NONE)
    */

    /*
    uuid
    @TableId(type = IdType.UUID)
    */


    private Long id;
    //@TableField("name")
    @TableField(condition = SqlCondition.LIKE)
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

    @TableField(exist = false)
    private String remark;
}
