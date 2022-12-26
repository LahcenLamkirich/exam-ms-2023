package com.lam.customerqueryservice.Mappers;

import com.lam.customerqueryservice.models.Customer;
import lam.CustomerRequestDTO;
import lam.CustomerResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer from(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO from(Customer customer);
}
