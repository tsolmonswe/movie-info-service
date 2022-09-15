package com.enduvo.api.movieinfoservice.controller;

import com.enduvo.api.movieinfoservice.model.Movie;
import com.enduvo.api.movieinfoservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/movies")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public @ResponseBody Iterable<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @RequestMapping(path = "/list/{movieId}", method = RequestMethod.GET)
    public @ResponseBody Optional<Movie> getDetail(@PathVariable("movieId") String movieId ){
        return movieRepository.findById(Integer.parseInt(movieId));
    }

}
