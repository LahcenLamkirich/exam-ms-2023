package com.lam.customerqueryservice.Repos;

import com.lam.customerqueryservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, String> {
}
