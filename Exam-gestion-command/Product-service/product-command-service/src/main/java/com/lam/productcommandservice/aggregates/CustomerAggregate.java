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
public class ProductAggregate {

    @TargetAggregateIdentifier
    private String productId ;
    private String name ;
    private String address ;
    private String telephone ;

    public ProductAggregate(){}

    @CommandHandler
    public CustomerAProductAggregateggregate(CreateNewProductCommand createNewProductCommand){
        ProductCreatedEvent customerCreatedEvent =
                new ProductCreatedEvent(createNewProductCommand.getId(),createNewProductCommand.getPayload());

        BeanUtils.copyProperties(createNewProductCommand, customerCreatedEvent);
        AggregateLifecycle.apply(createNewProductCommand);
    }
}
