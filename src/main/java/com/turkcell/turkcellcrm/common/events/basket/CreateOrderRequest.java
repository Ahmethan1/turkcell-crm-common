package com.turkcell.turkcellcrm.common.events.basket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest  {

    private String id;
    private int customerId;
    private int accountId;
    private double totalPrice;
    private List<BasketItemDto> basketItemDtos;

}