// package base.pkg.service;

// import base.pkg.entity.OrderEntity;
// import base.pkg.entity.OrderLineitemEntity;
// import base.pkg.model.OrderLineItemModel;
// import base.pkg.model.OrderModel;
// import base.pkg.repo.OrdersRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;

// @Service
// public class OrderServiceImpl implements OrderService {

//     @Autowired
//     public OrdersRepository ordersRepository;


//     public void orderCreate(OrderModel orderModel) {

//         OrderEntity orderEntity = OrderEntity.builder()
//                                 .orderId(orderModel.getOrderId())
//                                 .orderStatus(orderModel.getOrderStatus())
//                                 .orderDate(orderModel.getOrderDate())
//                                 .CustomerEmail(orderModel.getCustomerEmail())
//                                 .amount(orderModel.getAmount())
//                                 .ownerId(orderModel.getOwnerId())
//                                 .shopId(orderModel.getShopId())
//                                 .build();

//         List<OrderLineitemEntity>orderLineitemEntityList = new ArrayList<>();

//         //OrderModel model = null;
//         if (orderModel.getItems() != null) {

//             for(OrderLineItemModel orderLineItemModel : orderModel.getItems()) {

//             OrderLineitemEntity orderLineitemEntity = OrderLineitemEntity.builder()
//                                                     .product_name(orderLineItemModel.getProduct_name())
//                                                     .product_id(orderLineItemModel.getProduct_id())
//                                                     .variationId(orderLineItemModel.getVariationId())
//                                                     .price(orderLineItemModel.getPrice())
//                                                     .quantity(orderLineItemModel.getQuantity())
//                                                     .totalAmount(orderLineItemModel.getTotalAmount())
//                                                     .size(orderLineItemModel.getSize())
//                                                     .color(orderLineItemModel.getColor())
//                                                     .build();

//             orderLineitemEntity.setOrder(orderEntity);
//             orderLineitemEntityList.add(orderLineitemEntity);
//             }
//         }

//         orderEntity.setLineitems(orderLineitemEntityList);
//         ordersRepository.save(orderEntity);
//     }
// }
