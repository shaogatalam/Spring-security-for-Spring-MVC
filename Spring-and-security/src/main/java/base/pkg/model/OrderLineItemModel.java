package base.pkg.model;
//import jakarta.persistence.Column;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemModel {
    private String id;
    private String product_name;
    private String product_id;
    private long variationId;
    private int quantity;
    private double price;
    private double totalAmount;
    private String size;
    private String color;


    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getProduct_name() {return product_name;}
    public void setProduct_name(String product_name) {this.product_name = product_name;}

    public String getProduct_id() {return product_id;}
    public void setProduct_id(String product_id) {this.product_id = product_id;}

    public long getVariationId() {return variationId;}
    public void setVariationId(long variationId) {this.variationId = variationId;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public double getTotalAmount() {return totalAmount;}
    public void setTotalAmount(double totalAmount) {this.totalAmount = totalAmount;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
}
