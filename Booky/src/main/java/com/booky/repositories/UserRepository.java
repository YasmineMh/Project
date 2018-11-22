package com.booky.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booky.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
