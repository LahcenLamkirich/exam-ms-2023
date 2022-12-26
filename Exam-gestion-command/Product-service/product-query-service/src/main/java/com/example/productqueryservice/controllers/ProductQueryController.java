package com.example.productqueryservice.controllers;

import lam.*;
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
public class ProductQueryController {

    private QueryGateway queryGateway ;

    public ProductQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/products")
    public CompletableFuture<List<ProductResponseDTO>> ProductList(){
        return queryGateway.query(
                new GetAllPoductsQuery()
                , ResponseTypes.multipleInstancesOf(ProductResponseDTO.class)
        );
    }

    @GetMapping("/product/byId/{id}")
    public CompletableFuture<ProductResponseDTO> getProductById(@PathVariable String id){
        return queryGateway.query(
                new GetProductById(id)
                , ResponseTypes.instanceOf(ProductResponseDTO.class)
        );
    }

}
