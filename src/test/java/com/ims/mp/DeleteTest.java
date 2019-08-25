package com.ims.mp;

import com.ims.mp.mapper.UserMapper;
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

}
