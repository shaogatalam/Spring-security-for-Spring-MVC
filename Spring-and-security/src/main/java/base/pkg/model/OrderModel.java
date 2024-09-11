package base.pkg.model;

//import jakarta.persistence.Column;
import lombok.*;

import java.util.List;

//@Builder
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class OrderModel {
    private Long orderId;
    private String orderStatus;
    private String orderDate;
    private String CustomerEmail;
    private Double amount;
    private String ownerId;
    private String shopId;
    private List<OrderLineItemModel> items;


    public Long getOrderId() {return orderId;}
    public void setOrderId(Long orderId) {this.orderId = orderId;}

    public String getOrderStatus() {return orderStatus;}
    public void setOrderStatus(String orderStatus) {this.orderStatus = orderStatus;}

    public String getOrderDate() {return orderDate;}
    public void setOrderDate(String orderDate) {this.orderDate = orderDate;}

    public String getCustomerEmail() {return CustomerEmail;}
    public void setCustomerEmail(String customerEmail) {CustomerEmail = customerEmail;}

    public Double getAmount() {return amount;}
    public void setAmount(Double amount) {this.amount = amount;}

    public String getOwnerId() {return ownerId;}
    public void setOwnerId(String ownerId) {this.ownerId = ownerId;}

    public String getShopId() {return shopId;}
    public void setShopId(String shopId) {this.shopId = shopId;}

    //public List<OrderLineItemModel> getItems() {return items;}
    public void setItems(List<OrderLineItemModel> items) {this.items = items;}

}
