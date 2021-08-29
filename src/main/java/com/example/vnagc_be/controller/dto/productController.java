package com.example.vnagc_be.controller.dto;

import com.example.vnagc_be.models.dto.product;
import com.example.vnagc_be.service.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/Product")
@CrossOrigin(origins = "*")
public class productController {
    @Autowired
    productService productService;

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        List<product> listProduct = productService.getProducts();
        return new ResponseEntity<List<product>>(listProduct, HttpStatus.OK);
    }

}
