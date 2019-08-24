package com.ims.mp;

import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 01:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setRealName("jack love");
        user.setAge(26);
        user.setEmail("1234@qq.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        int rows = userMapper.insert(user);
        System.out.println("rows = " + rows);
    }
}
