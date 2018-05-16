package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by 13735 on 2018/5/9.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
