package com.yxb.dao;

import com.yxb.pojo.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {

    public Movie getMovie(){
        Movie movie = new Movie(1,"九千");
        return movie;
    }
}
