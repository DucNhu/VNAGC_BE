package com.example.vnagc_be.repository.dto;

import com.example.vnagc_be.models.dto.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Long> {
}
