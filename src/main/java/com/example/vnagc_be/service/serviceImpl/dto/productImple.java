package com.example.vnagc_be.service.serviceImpl.dto;

import com.example.vnagc_be.models.dto.product;
import com.example.vnagc_be.repository.dto.productRepository;
import com.example.vnagc_be.service.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productImple implements productService {

    @Autowired
    productRepository productRepository;
    @Override
    public List<product> getProducts() {
        return productRepository.findAll();
    }
}
