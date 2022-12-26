package com.lam.customerqueryservice.Repos;

import com.lam.customerqueryservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, String> {
}
