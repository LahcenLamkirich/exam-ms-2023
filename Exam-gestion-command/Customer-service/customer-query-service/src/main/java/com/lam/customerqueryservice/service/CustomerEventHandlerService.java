package com.lam.customerqueryservice.service;

import com.lam.customerqueryservice.Mappers.CustomerMapper;
import com.lam.customerqueryservice.Repos.CustomerRespository;
import com.lam.customerqueryservice.models.Customer;
import lam.CustomerCreatedEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.EventMessage;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j

public class CustomerEventHandlerService {
    private CustomerRespository customerRespository;

    private CustomerMapper customerMapper;
    private QueryUpdateEmitter queryUpdateEmitter;



    @EventHandler
    public void on(CustomerCreatedEvent event, EventMessage<CustomerCreatedEvent> eventMessage){

        Customer customer= customerMapper.from(event.getPayload());
        customer.setCustomerId(event.getId());
        customerRespository.save(customer);
        event.getPayload().setCustomerId(event.getId());


    }
}
