package com.enduvo.api.movieinfoservice.repository;

import com.enduvo.api.movieinfoservice.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
