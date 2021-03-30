package com.yxb.controller;

import com.yxb.pojo.Movie;
import com.yxb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/getMovie")
    public Movie getMovie(){
        return movieService.getMovie();
    }

}
