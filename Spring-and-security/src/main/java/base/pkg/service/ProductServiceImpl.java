package base.pkg.service;

import base.pkg.entity.ProductEntity;
import base.pkg.entity.ProductVariationEntity;
import base.pkg.model.ProductModel;
import base.pkg.model.ProductVariationModel;
import base.pkg.repo.ProductRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;

//import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;
    public ProductEntity productEntity;
    public ProductVariationEntity variationEntity;


    @Transactional
    public void insertBulkProducts(List<ProductEntity> products) {
        productRepository.saveAll(products);
    }


    @Transactional
    public List<ProductModel> getProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return convertToProductModels(productEntities);
    }
    private @NotNull List<ProductModel> convertToProductModels(@NotNull List<ProductEntity> productEntities) {
        List<ProductModel> productModels = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            ProductModel productModel = new ProductModel();
            productModel.setId((productEntity.getId()));
            productModel.setName(productEntity.getName());
            productModel.setPrice(productEntity.getPrice());
            productModel.setQuantity(productEntity.getQuantity());
            productModel.setType(productEntity.getType());
            productModel.setImageUrls(productEntity.getImageUrls());
            productModel.setOnSale(productEntity.isOnSale());
            productModel.setDescription(productEntity.getDescription());
            productModel.setCategory(productEntity.getCategory());
            productModel.setBrand(productEntity.getBrand());
            productModel.setRating(productEntity.getRating());
            productModel.setCreatedAt(productEntity.getCreatedAt());
            productModel.setUpdatedAt(productEntity.getUpdatedAt());
            productModels.add(productModel);
        }
        return productModels;
    }


    public ProductModel findVariableProductById(Long productId) {

        List<Object[]> result = productRepository.findVariableProductById(productId);

        List<ProductVariationEntity> variationEntities = new ArrayList<>();

        for (Object[] objects : result) {
            productEntity   = (ProductEntity) objects[0];
            variationEntity = (ProductVariationEntity) objects[1];
            variationEntities.add(variationEntity);
        }

        ProductModel productModel = new ProductModel();
        productModel.setId(productEntity.getId());
        productModel.setName(productEntity.getName());
        productModel.setQuantity(productEntity.getQuantity());
        productModel.setImageUrls(productEntity.getImageUrls());
        productModel.setOnSale(productEntity.isOnSale());
        productModel.setDescription(productEntity.getDescription());
        productModel.setCategory(productEntity.getCategory());
        productModel.setType(productEntity.getType());
        productModel.setBrand(productEntity.getBrand());
        productModel.setRating(productEntity.getRating());

        List<ProductVariationModel> variationModels = new ArrayList<>();
        for (ProductVariationEntity variationEntity : variationEntities) {
            ProductVariationModel variationModel = new ProductVariationModel();
            variationModel.setVariationId(variationEntity.getVariationId());
            variationModel.setSize(variationEntity.getSize());
            variationModel.setColor(variationEntity.getColor());
            variationModel.setImageUrls(variationEntity.getImageUrls());
            variationModel.setPrice(variationEntity.getPrice());
            variationModel.setQuantity(variationEntity.getQuantity());
            variationModels.add(variationModel);
        }
        productModel.setVariations(variationModels);
        return productModel;
    }

    public ProductModel findSimpleProductById(Long productId) {

        productEntity =  productRepository.findSimpleProductById(productId);

        ProductModel productModel = new ProductModel();
        productModel.setId(productEntity.getId());
        productModel.setName(productEntity.getName());
        productModel.setPrice(productEntity.getPrice());
        productModel.setQuantity(productEntity.getQuantity());
        productModel.setImageUrls(productEntity.getImageUrls());
        productModel.setOnSale(productEntity.isOnSale());
        productModel.setDescription(productEntity.getDescription());
        productModel.setCategory(productEntity.getCategory());
        productModel.setType(productEntity.getType());
        productModel.setBrand(productEntity.getBrand());
        productModel.setRating(productEntity.getRating());

        return productModel;
    }
}
