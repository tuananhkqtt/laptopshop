package com.tuananh.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuananh.laptopshop.domain.User;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    List<User> findAllByEmail(String email);

    User findById(long id);

    boolean existsByEmail(String email);

    User findByEmail(String email);

}
