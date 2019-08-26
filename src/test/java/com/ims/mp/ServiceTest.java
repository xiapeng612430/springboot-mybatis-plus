package com.ims.mp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ims.mp.entity.User;
import com.ims.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-27 00:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void selectOne() {
        User one = userService.getOne(Wrappers.<User>lambdaQuery().gt(User::getAge, 25), false);
        System.out.println(one);
    }
}
