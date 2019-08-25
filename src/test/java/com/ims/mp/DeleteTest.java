package com.ims.mp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-26 01:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeleteTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void deleteById() {
        int rows = userMapper.deleteById(1165326669666398210L);
        System.out.println("delete rows : " + rows);
    }

    @Test
    public void deleteByMap() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", "rookie");
        int rows = userMapper.deleteByMap(params);
        System.out.println("rows: " + rows);
    }

    @Test
    public void deleteByBatchIds() {
        int rows = userMapper.deleteBatchIds(Arrays.asList(1165679383436926977L, 1165679653965389825L));
        System.out.println("rows: " + rows);
    }

    @Test
    public void deleteByWapper() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getAge, 27).or().gt(User::getAge, 41);
        int delete = userMapper.delete(queryWrapper);
        System.out.println("rows: " + delete);
    }
}
