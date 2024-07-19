package com.Decoration.design.Decoration.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Decoration.design.Decoration.model.Orderlist;
import com.Decoration.design.Decoration.service.Orderlistservice;

@RestController
@RequestMapping("/api/order")
public class OrderlistController {

    @Autowired
    private Orderlistservice orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Orderlist>> getAllOrders() {
        List<Orderlist> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Orderlist> addOrder(@RequestBody Orderlist order) {
        Orderlist savedOrderlist = orderService.addOrder(order);
        return new ResponseEntity<>(savedOrderlist, HttpStatus.CREATED);
    }

    @GetMapping("/orderById/{id}")
    public ResponseEntity<Orderlist> getOrderById(@PathVariable("id") long id) {
        Orderlist orderlist = orderService.getOrderById(id);
        return new ResponseEntity<>(orderlist, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") long id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Orderlist> updateOrder(@PathVariable("id") long id, @RequestBody Orderlist order) {
        Orderlist updatedOrderlist = Orderlistservice.updateOrder(id, order);
        return new ResponseEntity<>(updatedOrderlist, HttpStatus.OK);
    }
}
