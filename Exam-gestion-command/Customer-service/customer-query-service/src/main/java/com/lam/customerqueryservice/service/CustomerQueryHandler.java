package com.lam.customerqueryservice.service;


import com.lam.customerqueryservice.Mappers.CustomerMapper;
import com.lam.customerqueryservice.Repos.CustomerRespository;
import com.lam.customerqueryservice.models.Customer;
import lam.CustomerResponseDTO;
import lam.GetAllCustomersQuery;
import lam.GetCustomerById;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerQueryHandler {
//    private CustomerRespository customerRespository;
//    private CustomerMapper customerMapper;
//
//    public CustomerQueryHandler(CustomerRespository customerRespository, CustomerMapper customerMapper) {
//        this.customerRespository = customerRespository;
//        this.customerMapper = customerMapper;
//    }
//
//    @QueryHandler
//    public List<CustomerResponseDTO> handler(GetAllCustomersQuery query){
//        List<Customer> allCustomers = customerRespository.findAll();
//        return allCustomers.stream().map(customer->customerMapper.from(customer))
//                .collect(Collectors.toList());
//    }
//
//
//    @QueryHandler
//    public Customer handler(GetCustomerById query){
//        Customer customer =customerRespository.findById(query.getCustomerId())
//                .orElseThrow(()->new RuntimeException("Customer Not found"));
//        return customer;
//    }
}
