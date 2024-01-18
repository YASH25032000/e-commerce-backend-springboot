package com.alpha.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
