package com.shop.spring.shop.devices.controller;

import com.shop.spring.shop.devices.model.Device;
import com.shop.spring.shop.devices.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping
    public ResponseEntity<?> saveDevise(@RequestBody Device device){
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}") //api/device/{deviceId}
    public ResponseEntity<?> deviceDelete(@PathVariable Long deviceId){
        deviceService.deleteDevice(deviceId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllDevice(){
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }
}
