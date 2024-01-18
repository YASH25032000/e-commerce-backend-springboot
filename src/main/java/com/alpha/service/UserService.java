package com.alpha.service;

import com.alpha.exception.UserException;
import com.alpha.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
