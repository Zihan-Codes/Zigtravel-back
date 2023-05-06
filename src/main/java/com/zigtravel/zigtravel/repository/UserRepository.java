package com.zigtravel.zigtravel.repository;

import com.zigtravel.zigtravel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
