package com.agavianSoft.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agavianSoft.springtest.models.Movie;
import com.agavianSoft.springtest.models.Review;
import com.agavianSoft.springtest.repository.MovieRepository;
import com.agavianSoft.springtest.repository.ReviewRepository;

@Service
public class MovieService {
	
	@Autowired
    private MovieRepository movieRepository;
	
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Review addReview(Long movieId, Review review) {
        Movie movie = movieRepository.findById(movieId).orElseThrow();
        review.setMovie(movie);
        return reviewRepository.save(review);
    }
}
