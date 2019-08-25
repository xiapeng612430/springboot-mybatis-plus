package com.ims.mp;

import com.ims.mp.entity.User;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xianpeng.xia
 * on 2019-08-26 01:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ARTeat {

    @Test
    public void insert() {
        User user = new User();
        user.setName("uzi");
        user.setAge(26);
        user.setEmail("1234@qq.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        boolean insert = user.insert();
        System.out.println("insert = " + insert);
    }

    @Test
    public void selectById() {
        User user = new User();
        user.setId(1165323365347557377L);
        User userSelect = user.selectById();
        System.out.println(userSelect);
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setId(1165323365347557377L);
        user.setName("the shy");
        boolean update = user.updateById();
        System.out.println(update);
    }

    @Test
    public void delateById() {
        User user = new User();
        user.setId(1165323365347557377L);
        boolean delete = user.deleteById();
        System.out.println(delete);
    }

    @Test
    public void insertOrUpdate() {
        User user = new User();
        user.setId(1165686110806892545L);
        user.setName("the shy");
        user.setAge(26);
        user.setEmail("1234@qq.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        boolean insertOrUpdate = user.insertOrUpdate();
        System.out.println(insertOrUpdate);
    }

}
