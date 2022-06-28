package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Device;
import com.shop.spring.shop.devices.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService{


    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device){
        device.setCreateTime(LocalDateTime.now()); //get the properties of the device

        return deviceRepository.save(device); //committing the save to the database.
    }

    @Override
    public void deleteDevice(Long id){
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices(){
        return deviceRepository.findAll();
    }
}
