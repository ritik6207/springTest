package com.agavianSoft.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agavianSoft.springtest.models.Review;
import com.agavianSoft.springtest.service.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
	
	 @Autowired
	 private ReviewService reviewService;

	 @PutMapping("/{reviewId}")
	 public Review updateReview(@PathVariable Long reviewId, @RequestBody Review updatedReview) {
	      return reviewService.updateReview(reviewId, updatedReview);
	 }
}
