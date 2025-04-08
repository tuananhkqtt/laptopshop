package com.spring.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.laptopshop.domain.Cart;
import com.spring.laptopshop.domain.CartDetail;
import com.spring.laptopshop.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    boolean existsByCartAndProduct(Cart cart, Product product);

    CartDetail findByCartAndProduct(Cart cart, Product product);
}
