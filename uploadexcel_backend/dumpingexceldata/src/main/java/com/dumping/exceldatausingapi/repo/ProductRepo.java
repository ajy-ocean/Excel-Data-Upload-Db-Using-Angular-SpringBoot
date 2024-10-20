package com.dumping.exceldatausingapi.repo;

import com.dumping.exceldatausingapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
