package com.shop.spring.shop.devices.repository.projection;

import com.shop.spring.shop.devices.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
