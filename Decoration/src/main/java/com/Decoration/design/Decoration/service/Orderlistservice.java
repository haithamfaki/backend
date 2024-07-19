package com.Decoration.design.Decoration.service;

import com.Decoration.design.Decoration.model.Orderlist;
import com.Decoration.design.Decoration.repository.OrderlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderlistservice {

    @Autowired
    private static OrderlistRepository orderRepository;

    public List<Orderlist> getAllOrders() {
        return orderRepository.findAll();
    }

    public Orderlist getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public Orderlist addOrder(Orderlist order) {
        return orderRepository.save(order);
    }

    public static Orderlist updateOrder(Long id, Orderlist orderDetails) {
        Orderlist order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setOrderdate(((Orderlist) orderDetails).getOrderDetails());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
