package base.pkg.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
//import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    private long id;
    private String name;
    private double price;
    private int quantity;
    private String imageUrls;
    private boolean onSale;
    private String description;
    private String category;
    private String type;
    private String brand;
    private double rating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<ProductVariationModel> variations;


    // Getters and Setters

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getImageUrls() {return imageUrls;}
    public void setImageUrls(String imageUrls) {this.imageUrls = imageUrls;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public boolean isOnSale() {return onSale;}
    public void setOnSale(boolean onSale) {this.onSale = onSale;}

    public String getImages() {return this.imageUrls;}
    public void setImages(String images) {this.imageUrls = images;}


    public List<ProductVariationModel> getVariations() {return variations;}
    public void setVariations(List<ProductVariationModel> variations) {this.variations = variations;}


    public void increaseQuantity(int amount) {this.quantity += amount;}
    public void decreaseQuantity(int amount) {
        if (this.quantity >= amount) {this.quantity -= amount;}
        else {throw new IllegalArgumentException("Insufficient quantity");}
    }



}
