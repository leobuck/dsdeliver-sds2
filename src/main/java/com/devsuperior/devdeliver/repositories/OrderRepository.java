package com.devsuperior.devdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
