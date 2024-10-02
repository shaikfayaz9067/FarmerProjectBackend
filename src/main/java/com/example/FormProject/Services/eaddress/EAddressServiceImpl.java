package com.example.FormProject.Services.eaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormProject.Model.EAddress;
import com.example.FormProject.Repository.EAddressRepository;

import java.util.List;
import java.util.Optional;

@Service // Make this class a Spring Service
public class EAddressServiceImpl implements EAddressService {
    
    @Autowired
    private EAddressRepository addressRepository;

    @Override
    public EAddress createAddress(EAddress address) {
        return addressRepository.save(address);
    }

    @Override
    public List<EAddress> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<EAddress> getAddressById(String id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<EAddress> getAddressesByUserId(String userId) {
        return addressRepository.findByUserId(userId);
    }

    @Override
    public EAddress updateAddress(String id, EAddress address) {
        address.setId(id); // Set the ID of the address being updated
        return addressRepository.save(address); // Save the updated address
    }

    @Override
    public void deleteAddress(String id) {
        addressRepository.deleteById(id); // Delete the address by ID
    }
}
