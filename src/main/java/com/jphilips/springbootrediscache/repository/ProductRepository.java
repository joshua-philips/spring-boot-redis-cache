package com.jphilips.springbootrediscache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jphilips.springbootrediscache.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
