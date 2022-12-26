package com.lam.customerqueryservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id
    public String customerId ;
    public String name ;
    public String address ;
    public String telephone ;

}
