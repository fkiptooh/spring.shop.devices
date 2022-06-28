package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Purchase;
import com.shop.spring.shop.devices.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
