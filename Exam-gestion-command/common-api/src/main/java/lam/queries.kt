package lam


/* Customer */
class GetAllCustomersQuery();

data class GetCustomerById(
    val customerId:String,
);

/* Products */

class GetAllPoductsQuery();

data class GetProductById(
    val productId:String
)
