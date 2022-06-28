package com.shop.spring.shop.devices.repository;

import com.shop.spring.shop.devices.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
