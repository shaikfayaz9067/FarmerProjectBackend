package com.example.FormProject.Controllers;

import com.example.FormProject.Model.EAddress;
import com.example.FormProject.Services.eaddress.EAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin({"http://localhost:4200", "http://localhost:5000", "http://localhost:3000"})
public class EAddressController {

    @Autowired
    private EAddressService addressService;

    @PostMapping
    public ResponseEntity<EAddress> createAddress(@RequestBody EAddress address) {
        EAddress createdAddress = addressService.createAddress(address);
        return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EAddress>> getAllAddresses() {
        List<EAddress> addresses = addressService.getAllAddresses();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EAddress> getAddressById(@PathVariable String id) {
        Optional<EAddress> address = addressService.getAddressById(id);
        return address.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
                      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EAddress> updateAddress(@PathVariable String id, @RequestBody EAddress address) {
        EAddress updatedAddress = addressService.updateAddress(id, address);
        return updatedAddress != null ? new ResponseEntity<>(updatedAddress, HttpStatus.OK)
                                      : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable String id) {
        addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<EAddress>> getAddressesByUserId(@PathVariable String userId) {
        List<EAddress> addressesByUser = addressService.getAddressesByUserId(userId);
        return new ResponseEntity<>(addressesByUser, HttpStatus.OK);
    }
}
