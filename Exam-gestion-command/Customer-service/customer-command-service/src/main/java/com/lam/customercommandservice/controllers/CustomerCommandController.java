package com.lam.customercommandservice.controllers;

import lam.CreateNewCustomerCommand;
import lam.CustomerRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands")
public class CustomerCommandController {
    private CommandGateway commandGateway ;
    private EventStore eventStore ;

    public CustomerCommandController(CommandGateway commandGateway, EventStore eventStore) {
        this.commandGateway = commandGateway;
        this.eventStore = eventStore;
    }

    @PostMapping("/customer/save")
    public CompletableFuture<String> addNewCustomerCommand(@RequestBody CustomerRequestDTO request){
        return this.commandGateway.send(new CreateNewCustomerCommand(
                UUID.randomUUID().toString(),
                request
        ));
    }

}
