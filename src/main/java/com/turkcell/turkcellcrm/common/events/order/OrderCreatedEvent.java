package com.turkcell.turkcellcrm.common.events.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private double totalPrice ;
    private int addressId;
    private int accountId;
    private List<OrderItem> orderItemList;
    private int customerId;
}
