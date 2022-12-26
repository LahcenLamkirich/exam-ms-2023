package lam

import org.axonframework.modelling.command.TargetAggregateIdentifier


abstract class BaseCommand<T>(
    @TargetAggregateIdentifier open val id : T
);

// Customer Service
data class CreateNewCustomerCommand(
    override val id : String,
    val payload : CustomerRequestDTO,
) : BaseCommand<String>(id);



// Iventory Service

data class CreateProductCommand(
    override val id : String,
    val payload : ProductRequestDTO,
) : BaseCommand<String>(id);

