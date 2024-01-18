package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
