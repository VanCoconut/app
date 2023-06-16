package com.lipari.app.orders.controllers;

import com.lipari.app.orders.entities.Order;
import com.lipari.app.orders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lipari.app.orders.repositories.OrderRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/neworder")
    public ResponseEntity<String> newOrder(@RequestBody Order order){
        return ResponseEntity.ok(orderService.addOrder(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable String id){
        return ResponseEntity.ok(orderService.findOrderById(id));
    }

    @GetMapping("/allorders/{id}")
    public ResponseEntity<List<Order>> allOrdersById(@PathVariable int id){
        return ResponseEntity.ok(orderService.retrieveAllOrders(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id){
        return ResponseEntity.ok(orderService.deleteOrder(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(@RequestBody Order order, @PathVariable String id){
        return ResponseEntity.ok(orderService.update(order,id));
    }

    @PostMapping("/added")
    public ResponseEntity<String> addBasket(@RequestParam String orderId, @RequestParam int productId, @RequestParam int qta){
        return ResponseEntity.ok(orderService.addProduct(orderId, productId, qta));
    }
    /*@GetMapping("/viewbasket/{id}")
    public ResponseEntity<Map<Integer, String>> retrieveBasketOrder(@PathVariable String id){
        return ResponseEntity.ok(orderService.retrieveBasketXOrder(id));
    }*/
}
