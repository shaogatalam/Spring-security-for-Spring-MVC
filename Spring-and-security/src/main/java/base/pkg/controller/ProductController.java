package base.pkg.controller;

import base.pkg.entity.ProductEntity;
import base.pkg.entity.ProductVariationEntity;
import base.pkg.model.ProductModel;
import base.pkg.model.ProductVariationModel;
import base.pkg.service.ProductService;
import jakarta.servlet.http.HttpServletResponse;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Slf4j
@RestController
// @CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST},
//         allowedHeaders = {"Authorization", "Content-Type"}, allowCredentials = "true")
public class ProductController {

    @Autowired
    public ProductService productService;

    //  :: Insert Bulk Products
    @PostMapping("/bulkInsert")
    public void bulkInsert(@RequestBody List<ProductModel> products, HttpServletResponse response) {

        if (products == null || products.isEmpty()) {response.setStatus(HttpServletResponse.SC_BAD_REQUEST); return; }

        List<ProductEntity> productEntities = new ArrayList<>();

        for (ProductModel productModel : products) {

            if ("simple".equalsIgnoreCase(productModel.getType())) {

                ProductEntity simpleProduct = ProductEntity.builder()
                                            .name(productModel.getName())
                                            .price(productModel.getPrice())
                                            .quantity(productModel.getQuantity())
                                            .image_urls(productModel.getImageUrls())
                                            .on_sale(productModel.isOnSale())
                                            .description(productModel.getDescription())
                                            .category(productModel.getCategory())
                                            .type(productModel.getType())
                                            .brand(productModel.getBrand())
                                            .rating(productModel.getRating())
                                            .created_at(productModel.getCreatedAt())
                                            .updated_at(productModel.getUpdatedAt())
                                            .build();

                productEntities.add(simpleProduct);

            }
            else if ("Variable".equalsIgnoreCase(productModel.getType())) {

                ProductEntity variableProduct = ProductEntity.builder()
                                                .name(productModel.getName())
                                                .quantity(productModel.getQuantity())
                                                .image_urls(productModel.getImageUrls())
                                                .on_sale(productModel.isOnSale())
                                                .description(productModel.getDescription())
                                                .category(productModel.getCategory())
                                                .type(productModel.getType())
                                                .brand(productModel.getBrand())
                                                .rating(productModel.getRating())
                                                .created_at(productModel.getCreatedAt())
                                                .updated_at(productModel.getUpdatedAt())
                                                .build();

                // Create variation entities for the variable product
                List<ProductVariationEntity> variationEntities = new ArrayList<>();
                for (ProductVariationModel variationModel : productModel.getVariations()) {
                    ProductVariationEntity variationEntity = ProductVariationEntity.builder()
                                                            .variationId(variationModel.getVariationId())
                                                            .size(variationModel.getSize())
                                                            .color(variationModel.getColor())
                                                            .imageUrls(variationModel.getImageUrls())
                                                            .price(variationModel.getPrice())
                                                            .quantity(variationModel.getQuantity())
                                                            .build();
                    variationEntity.setProduct(variableProduct);
                    variationEntities.add(variationEntity);
                }

                variableProduct.setVariations(variationEntities);
                productEntities.add(variableProduct);
            }
        }
        productService.insertBulkProducts(productEntities);
    }


    //  :: Get All product
    @GetMapping("/products")
    public List<ProductModel> getProducts() {
        return productService.getProducts();
    }


    //  :: Get single variable product
    @GetMapping("/product/v/{productId}")
    public ResponseEntity<ProductModel> getVariableProductById(@PathVariable Long productId) {
        ProductModel VariableProductModel = productService.findVariableProductById(productId);
        return ResponseEntity.ok(VariableProductModel);
    }


    //  :: Get single simple product
    @GetMapping("/product/s/{productId}")
    public ResponseEntity<ProductModel> getSimpleProductById(@PathVariable Long productId) {
        ProductModel SimpleProductModel = productService.findSimpleProductById(productId);
        return ResponseEntity.ok(SimpleProductModel);
    }
}
