package com.agavianSoft.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agavianSoft.springtest.models.Review;
import com.agavianSoft.springtest.repository.ReviewRepository;

@Service
public class ReviewService {
	
	 @Autowired
	 private ReviewRepository reviewRepository;

	 public Review updateReview(Long reviewId, Review updatedReview) {
	      Review existingReview = reviewRepository.findById(reviewId).orElseThrow();
	      existingReview.setComment(updatedReview.getComment());
	      existingReview.setRating(updatedReview.getRating());
	      return reviewRepository.save(existingReview);
	  }
}
