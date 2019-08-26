package com.ims.mp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ims.mp.entity.User;
import com.ims.mp.service.UserService;
import java.util.Arrays;
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

    @Test
    public void Batch() {
        User user1 = new User();
        user1.setName("mlxg");
        user1.setAge(22);
        User user2 = new User();
        user2.setId(1165686110806892549L);
        user2.setName("zitai");
        user2.setAge(23);
        //boolean saveBatch = userService.saveBatch(Arrays.asList(user1, user2));
        boolean saveBatch = userService.saveOrUpdateBatch(Arrays.asList(user1, user2));
        System.out.println("saveBatch : " + saveBatch);
    }
}
