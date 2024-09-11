// package base.pkg.controller;

// import base.pkg.model.OrderModel;
// import base.pkg.service.OrderService;
// //import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @CrossOrigin(origins = "http://localhost:3000",
//         methods = {RequestMethod.GET, RequestMethod.POST},
//         allowedHeaders = {"Authorization", "Content-Type"},
//         allowCredentials = "true")
// //@Slf4j
// public class OrderController {

//     @Autowired
//     public OrderService orderService;

//     @PostMapping("/OrderCreate")
//     public void OrderPlaced(@RequestBody OrderModel order){
//         orderService.orderCreate(order);
//     }
// }
