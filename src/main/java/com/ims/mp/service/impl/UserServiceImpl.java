package com.ims.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ims.mp.entity.User;
import com.ims.mp.mapper.UserMapper;
import com.ims.mp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by xianpeng.xia
 * on 2019-08-27 00:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
