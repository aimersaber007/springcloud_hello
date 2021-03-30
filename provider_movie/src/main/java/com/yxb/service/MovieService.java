package com.yxb.service;

import com.yxb.dao.MovieDao;
import com.yxb.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieDao movieDao;

    public Movie getMovie(){
        return movieDao.getMovie();
    }
}
