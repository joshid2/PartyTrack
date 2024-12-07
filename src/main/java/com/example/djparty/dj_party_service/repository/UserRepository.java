package com.example.djparty.dj_party_service.repository;

import com.example.djparty.dj_party_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
