package com.shop.spring.shop.devices.controller;

import com.shop.spring.shop.devices.model.Purchase;
import com.shop.spring.shop.devices.security.UserPrincipal;
import com.shop.spring.shop.devices.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrincipal.getId()));
    }
}
