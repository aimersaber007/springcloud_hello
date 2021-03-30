package com.yxb.dao;

import com.yxb.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User getUser(Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("荀彧");
        return user;
    }
}
