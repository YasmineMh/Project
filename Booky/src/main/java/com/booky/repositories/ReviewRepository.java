package com.booky.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booky.entities.Review;

public interface ReviewRepository extends JpaRepository<Review , Long>{

}
