package com.ims.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 10:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConditionTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void condition() {
        String name = "";
        String email = "y";
        QueryWrapper queryWrapper = new QueryWrapper<User>();
        queryWrapper.like(StringUtils.isNotEmpty(name), "name", name)
            .like(StringUtils.isNotEmpty(email), "email", email);
        List list = userMapper.selectList(queryWrapper);
        list.forEach(System.err::println);
    }
}
