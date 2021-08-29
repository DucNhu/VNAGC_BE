package com.example.vnagc_be.service.service;

import com.example.vnagc_be.models.dto.product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface productService {
    List<product> getProducts();
}
