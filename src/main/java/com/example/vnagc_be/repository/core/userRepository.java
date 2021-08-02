package com.example.vnagc_be.repository.core;

import com.example.vnagc_be.models.core.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
}
