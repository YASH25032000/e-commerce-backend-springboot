package com.alpha.service;

import java.util.List;

import com.alpha.exception.ProductException;
import com.alpha.modal.Review;
import com.alpha.modal.User;
import com.alpha.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
