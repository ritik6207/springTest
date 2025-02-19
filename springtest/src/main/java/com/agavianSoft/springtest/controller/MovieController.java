package com.agavianSoft.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agavianSoft.springtest.models.Movie;
import com.agavianSoft.springtest.models.Review;
import com.agavianSoft.springtest.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	 	@Autowired
	    private MovieService movieService;

	    @GetMapping
	    public List<Movie> getAllMovies() {
	        return movieService.getAllMovies();
	    }

	    @PostMapping
	    public Movie addMovie(@RequestBody Movie movie) {
	        return movieService.addMovie(movie);
	    }

	    @PostMapping("/{movieId}/reviews")
	    public Review addReview(@PathVariable Long movieId, @RequestBody Review review) {
	        return movieService.addReview(movieId, review);
	    }
	
}
