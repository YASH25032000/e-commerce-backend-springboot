package com.alpha.service;

import com.alpha.exception.ProductException;
import com.alpha.modal.Cart;
import com.alpha.modal.User;
import com.alpha.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
