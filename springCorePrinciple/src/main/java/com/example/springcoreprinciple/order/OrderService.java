package com.example.springcoreprinciple.order;

public interface OrderService {
 Order createOrder(Long memberId, String itemName, int itemPrice);
 }
