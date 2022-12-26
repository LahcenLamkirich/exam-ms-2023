package lam


// Customer :
abstract class BaseEvent<T> (
    open val id: T
);
data class CustomerCreatedEvent(
    override val id : String,
    val payload:CustomerRequestDTO
):BaseCommand<String>(id);

// Product :

data class ProductCreatedEvent(
    override val id : String,
    val payload:ProductRequestDTO
):BaseCommand<String>(id);



