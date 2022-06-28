package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Device;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
