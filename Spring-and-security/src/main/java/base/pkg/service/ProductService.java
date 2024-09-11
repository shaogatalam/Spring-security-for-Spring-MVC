package base.pkg.service;

import base.pkg.entity.ProductEntity;
import base.pkg.model.ProductModel;

import java.util.List;
//import java.util.Optional;

public interface ProductService {
    void insertBulkProducts(List<ProductEntity> products);
    List<ProductModel> getProducts();
    ProductModel findVariableProductById(Long productId);
    ProductModel findSimpleProductById(Long productId);
}
