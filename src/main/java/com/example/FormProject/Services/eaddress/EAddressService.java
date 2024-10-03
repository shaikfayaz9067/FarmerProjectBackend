package com.example.FormProject.Services.eaddress;

import com.example.FormProject.Model.EAddress;

import java.util.List;
import java.util.Optional;

public interface EAddressService {
    EAddress createAddress(EAddress address);
    List<EAddress> getAllAddresses();
    Optional<EAddress> getAddressById(String id);
    List<EAddress> getAddressesByUserId(String userId);
    EAddress updateAddress(String id, EAddress address);
    void deleteAddress(String id);
}
