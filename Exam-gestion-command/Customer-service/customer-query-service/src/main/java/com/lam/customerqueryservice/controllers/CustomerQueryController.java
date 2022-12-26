package com.lam.customerqueryservice.controllers;

import lam.CustomerResponseDTO;
import lam.GetAllCustomersQuery;
import lam.GetCustomerById;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/query")
public class CustomerQueryController {

    private QueryGateway queryGateway ;

    public CustomerQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/customers")
    public CompletableFuture<List<CustomerResponseDTO>> CustomersList(){
        return queryGateway.query(
                new GetAllCustomersQuery()
                , ResponseTypes.multipleInstancesOf(CustomerResponseDTO.class)
        );
    }

    @GetMapping("/customer/byId/{id}")
    public CompletableFuture<CustomerResponseDTO> getCustomerById(@PathVariable String id){
        return queryGateway.query(
                new GetCustomerById(id)
                , ResponseTypes.instanceOf(CustomerResponseDTO.class)
        );
    }

}
