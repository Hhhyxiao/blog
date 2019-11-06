package com.hyxiao.bolg.service;

import com.hyxiao.bolg.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
