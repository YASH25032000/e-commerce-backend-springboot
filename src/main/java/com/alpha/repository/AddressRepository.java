package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
