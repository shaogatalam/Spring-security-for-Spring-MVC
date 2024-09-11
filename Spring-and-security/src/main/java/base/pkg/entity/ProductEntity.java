package base.pkg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double price;
    private int quantity;
    private String image_urls;
    private boolean on_sale;
    private String description;
    private String category;
    private String brand;
    private String type;
    private double rating;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;


    
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @Default
    private List<ProductVariationEntity> variations = new ArrayList<>();


    // Getters and Setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrls() {
        return image_urls;
    }
    public void setImageUrls(String imageUrls) {
        this.image_urls = imageUrls;
    }

    public boolean isOnSale() {
        return on_sale;
    }
    public void setOnSale(boolean onSale) {
        this.on_sale = onSale;
    }

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public LocalDateTime getCreatedAt() {
        return created_at;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.created_at = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updated_at = updatedAt;}

    public List<ProductVariationEntity> getVariations() {return variations;}
    public void setVariations(List<ProductVariationEntity> variations) {this.variations = variations;}


}


