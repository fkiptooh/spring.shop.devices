package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Purchase;
import com.shop.spring.shop.devices.repository.PurchaseRepository;
import com.shop.spring.shop.devices.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{


    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId){
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}
