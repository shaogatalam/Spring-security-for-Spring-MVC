package base.pkg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
// import lombok.RequiredArgsConstructor;
// import java.util.List;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_variations")
public class ProductVariationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "variation_id")
    private long variationId;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "image_url")
    private String imageUrls;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "product_id")
    @JoinColumn(name = "products_id")
    private ProductEntity product;

    public long getVariationId() {return variationId;}
    public void setVariationId(long variationId) {this.variationId = variationId;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getImageUrls() {return imageUrls;}
    public void setImageUrls(String imageUrls) {this.imageUrls = imageUrls;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public ProductEntity getProduct() {return product;}
    public void setProduct(ProductEntity product) {this.product = product;}

}
