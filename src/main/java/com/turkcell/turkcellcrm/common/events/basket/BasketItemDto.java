package com.turkcell.turkcellcrm.common.events.basket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketItemDto {

    private int productId;
    private String name;
    private double price;
}
