package com.yxb.service;

import com.yxb.dao.UserDao;
import com.yxb.pojo.Movie;
import com.yxb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    public User getUserId(Integer id){
        User user = userDao.getUser(id);
        return user;
    }
    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> result = new HashMap<>();
        User user = this.getUserId(id);
        result.put("user",user);
        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie",Movie.class);
        result.put("movie",movie);
        return result;
    }
}
