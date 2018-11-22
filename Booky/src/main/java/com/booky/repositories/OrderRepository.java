package com.booky.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booky.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
