package com.example.FormProject.Controllers;

import com.example.FormProject.Model.EOrder;
import com.example.FormProject.Services.eorder.EOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eorders")
@CrossOrigin("http://localhost:4200") // Adjust or remove based on your needs
public class EOrderController {

    @Autowired
    private EOrderService orderService;

    @PostMapping
    public ResponseEntity<EOrder> createOrder(@RequestBody EOrder order) {
        EOrder createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EOrder>> getAllOrders() {
        List<EOrder> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EOrder> getOrderById(@PathVariable String id) {
        Optional<EOrder> order = orderService.getOrderById(id);
        return order.map(o -> new ResponseEntity<>(o, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EOrder> updateOrder(@PathVariable String id, @RequestBody EOrder order) {
        EOrder updatedOrder = orderService.updateOrder(id, order);
        return updatedOrder != null ? new ResponseEntity<>(updatedOrder, HttpStatus.OK)
                                    : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<EOrder>> getOrdersByUserId(@PathVariable String userId) {
        List<EOrder> ordersByUser = orderService.getOrdersByUserId(userId);
        return new ResponseEntity<>(ordersByUser, HttpStatus.OK);
    }
}
