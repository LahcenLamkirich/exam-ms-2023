package lam

data class CustomerRequestDTO(
    var customerId : String ="",
    var name : String="",
    var address: String="",
    var telephone : String=""
);


data class CustomerResponseDTO(
    var customerId : String ="",
    var name : String="",
    var address: String="",
    var telephone : String=""
);

data class ProductRequestDTO(
    var productId: String="",
    var name: String="",
    var price : Double=0.0,
    var quantity: Double=0.0,
    var stateProduct: StateProduct
);

data class ProductResponseDTO(
    var productId: String="",
    var name: String="",
    var price : Double=0.0,
    var quantity: Double=0.0,
    var stateProduct: StateProduct
)




