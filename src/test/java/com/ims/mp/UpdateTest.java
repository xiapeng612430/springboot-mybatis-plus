package com.ims.mp;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-26 01:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void updateByIds() {
        User user = new User();
        user.setId(1088248166370832385L);
        user.setAge(26);
        user.setEmail("wtf@qq.com");
        int rows = userMapper.updateById(user);
        System.out.println("update : " + rows);
    }

    @Test
    public void updateByWrapper() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("name", "李艺伟").eq("age", 28);
        User user = new User();
        user.setAge(29);
        user.setEmail("lyw@cumtb.edu");
        int update = userMapper.update(user, updateWrapper);
        System.out.println("update: " + update);
    }

    @Test
    public void updateByWrapper() {
        User whereUser = new User();
        whereUser.setName("李艺伟");
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>(whereUser);
        //updateWrapper.eq("name", "李艺伟").eq("age", 28);
        User user = new User();
        user.setAge(29);
        user.setEmail("lyw@cumtb.edu");
        int update = userMapper.update(user, updateWrapper);
        System.out.println("update: " + update);
    }
}
