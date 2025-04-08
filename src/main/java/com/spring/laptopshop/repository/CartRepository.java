package com.spring.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.laptopshop.domain.Cart;
import com.spring.laptopshop.domain.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);
}
