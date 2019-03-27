package com.example.repository;

import com.example.model.StaticProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaticProductRepository extends JpaRepository<StaticProduct, Long> {
    StaticProduct findByNameAndProducer(String name, String producer );
    StaticProduct findByBarCode(String barcode);

}
