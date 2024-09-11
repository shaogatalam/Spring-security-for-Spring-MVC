// package base.pkg.entity;


// import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.NoArgsConstructor;

// @Entity
// @Builder
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "order_items")
// public class OrderLineitemEntity {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     @Column(name = "product_name")
//     private String product_name;

//     @Column(name = "product_id")
//     private String product_id;

//     @Column(name = "variation_id")
//     private long variationId;

//     @Column(name = "unit")
//     private int quantity;

//     @Column(name = "unit_price")
//     private double price;

//     @Column(name = "total_price")
//     private double totalAmount;

//     @Column(name = "size")
//     private String size;

//     @Column(name = "color")
//     private String color;

//     @ManyToOne(fetch = FetchType.LAZY)
//     @JoinColumn(name = "orders_order_id")
//     private OrderEntity order;

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getProduct_name() {
//         return product_name;
//     }

//     public void setProduct_name(String product_name) {
//         this.product_name = product_name;
//     }

//     public String getProduct_id() {
//         return product_id;
//     }

//     public void setProduct_id(String product_id) {
//         this.product_id = product_id;
//     }

//     public long getVariationId() {
//         return variationId;
//     }

//     public void setVariationId(long variationId) {
//         this.variationId = variationId;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     public void setQuantity(int quantity) {
//         this.quantity = quantity;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public double getTotalAmount() {
//         return totalAmount;
//     }

//     public void setTotalAmount(double totalAmount) {
//         this.totalAmount = totalAmount;
//     }

//     public String getSize() {
//         return size;
//     }

//     public void setSize(String size) {
//         this.size = size;
//     }

//     public String getColor() {
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public OrderEntity getOrder() {
//         return order;
//     }

//     public void setOrder(OrderEntity order) {
//         this.order = order;
//     }
// }
