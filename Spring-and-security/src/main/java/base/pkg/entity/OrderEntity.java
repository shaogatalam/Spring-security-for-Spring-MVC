// package base.pkg.entity;

// import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Builder.Default;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// import java.util.ArrayList;
// import java.util.List;

// @Entity
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// @Table(name = "orders")
// public class OrderEntity {
	
// 	@Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
// 	@Column(name = "order_id")
// 	private Long orderId;

// 	@Column(name = "order_status")
// 	private String orderStatus;
// 	@Column(name = "order_date")
// 	private String orderDate;
// 	@Column(name = "customer_email")
// 	private String CustomerEmail;
// 	@Column(name = "order_amount")
// 	private Double amount;
// 	@Column(name = "owner_id")
// 	private String ownerId;
// 	@Column(name = "shop_id")
// 	private String shopId;

// 	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
// 	@Default
// 	private List<OrderLineitemEntity> lineitems = new ArrayList<>();


// 	public String getOrderDate() {return orderDate;}
// 	public void setOrderDate(String orderDate) {this.orderDate = orderDate;}


// 	public List<OrderLineitemEntity> getLineitems() {return lineitems;}
// 	public void setLineitems(List<OrderLineitemEntity> lineitems) {this.lineitems = lineitems;}



// 	public Long getOrderId() {
// 		return orderId;
// 	}
// 	public void setOrderId(Long orderId) {
// 		this.orderId = orderId;
// 	}



// 	public String getOrderStatus() {
// 		return orderStatus;
// 	}
// 	public void setOrderStatus(String orderStatus) {
// 		this.orderStatus = orderStatus;
// 	}


// 	public String getCustomerEmail() {
// 		return CustomerEmail;
// 	}
// 	public void setCustomerEmail(String customerEmail) {
// 		CustomerEmail = customerEmail;
// 	}


// 	public Double getAmount() {
// 		return amount;
// 	}
// 	public void setAmount(Double amount) {
// 		this.amount = amount;
// 	}


// 	public String getOwnerId() {
// 		return ownerId;
// 	}
// 	public void setOwnerId(String ownerId) {
// 		this.ownerId = ownerId;
// 	}


// 	public String getShopId() {
// 		return shopId;
// 	}
// 	public void setShopId(String shopId) {
// 		this.shopId = shopId;
// 	}
	
// }
