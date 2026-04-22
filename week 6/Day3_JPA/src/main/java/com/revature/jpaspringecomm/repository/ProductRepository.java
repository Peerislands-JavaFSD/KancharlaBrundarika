package com.revature.jpaspringecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.jpaspringecomm.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}