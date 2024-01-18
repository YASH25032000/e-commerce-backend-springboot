package com.alpha.service;

import java.util.List;

import com.alpha.exception.ProductException;
import com.alpha.modal.Rating;
import com.alpha.modal.User;
import com.alpha.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
