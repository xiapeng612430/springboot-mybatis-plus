package com.ims.mp.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 01:35
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

}
