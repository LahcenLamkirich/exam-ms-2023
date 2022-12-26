package com.example.productqueryservice.Mappers;

import com.example.productqueryservice.models.Product;
import lam.ProductRequestDTO;
import lam.ProductResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product from(ProductRequestDTO productRequestDTO);
    ProductResponseDTO from(Product product);
}
