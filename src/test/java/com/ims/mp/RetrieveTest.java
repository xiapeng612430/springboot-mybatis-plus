package com.ims.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 02:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RetrieveTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById() {
        User user = userMapper.selectById(1094590409767661570L);
        System.out.println(user);
    }


    @Test
    public void selectIds() {
        List<Long> idsList = Arrays.asList(1088248166370832385L, 1094592041087729666L, 1087982257332887553L);
        List<User> list = userMapper.selectBatchIds(idsList);
        list.forEach(System.err::println);
    }

    @Test
    public void selectByMap() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name", "ts");
        columnMap.put("age", 26);
        List<User> list = userMapper.selectByMap(columnMap);
        list.forEach(System.err::println);
    }

    @Test
    public void selectByWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.like("name", "雨").lt("age", 40);
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.err::println);
    }
}
