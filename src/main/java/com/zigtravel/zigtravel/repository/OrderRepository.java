package com.zigtravel.zigtravel.repository;

import com.zigtravel.zigtravel.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
