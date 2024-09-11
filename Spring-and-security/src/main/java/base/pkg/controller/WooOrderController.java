//package com.springboot1.demo.controller;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Base64;
//
//@RestController
//public class WooOrderController {
//
//    @PostMapping("/OrderCreate")
//    public static void fetchWooCommerceOrders() {
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        // WooCommerce API credentials
//        String consumerKey = "your_consumer_key";
//        String consumerSecret = "your_consumer_secret";
//        String baseUrl = "http://localhost/wordpress"; // Replace with your WooCommerce store URL
//
//        // API endpoint URL
//        String ordersUrl = baseUrl + "/wp-json/wc/v3/orders";
//
//        // Set authentication credentials
//        String authHeader = "Basic " + Base64.getEncoder().encodeToString((consumerKey + ":" + consumerSecret).getBytes());
//
//        // Set request headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", authHeader);
//
//        // Make the request
//        ResponseEntity<String> response = restTemplate.exchange(ordersUrl, HttpMethod.GET, new HttpEntity<>(headers), String.class);
//
//        // Get the response body
//        String responseBody = response.getBody();
//
//        // Print the response
//        System.out.println(responseBody);
//    }
//}
