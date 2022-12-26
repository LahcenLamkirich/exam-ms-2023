package com.lam.customercommandservice.aggregates;

import lam.CreateNewCustomerCommand;
import lam.CustomerCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

@Aggregate
@Slf4j
public class CustomerAggregate {

    @TargetAggregateIdentifier
    private String customerId ;
    private String name ;
    private String address ;
    private String telephone ;

    public CustomerAggregate(){}

    @CommandHandler
    public CustomerAggregate(CreateNewCustomerCommand createNewCustomerCommand){
        CustomerCreatedEvent customerCreatedEvent =
                new CustomerCreatedEvent(createNewCustomerCommand.getId(),createNewCustomerCommand.getPayload());

        BeanUtils.copyProperties(createNewCustomerCommand, customerCreatedEvent);
        AggregateLifecycle.apply(customerCreatedEvent);
    }
}
