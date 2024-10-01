package com.example.FormProject.Controllers;

import com.example.FormProject.Model.Transport;
import com.example.FormProject.Services.transport.TransportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transports")
@CrossOrigin({ "http://localhost:4200", "http://localhost:5000", "http://localhost:3000" })
public class TransportController {

    @Autowired
    private TransportService transportService;

   @PostMapping
    public ResponseEntity<Transport> createTransport(
            @RequestParam("vehiclePhoto") MultipartFile vehiclePhoto) {
        Transport transport = new Transport();

        try {
            // Store the image as a byte array
            transport.setVehiclePhoto(vehiclePhoto.getBytes());

            // Set the content type of the uploaded image
            String contentType = vehiclePhoto.getContentType(); // This will be "image/jpeg", "image/png", etc.
            transport.setVehiclePhotoContentType(contentType);

            // Save the transport object in the database
            Transport createdTransport = transportService.createTransport(transport);
            return new ResponseEntity<>(createdTransport, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping
    public ResponseEntity<List<Transport>> getAllTransports() {
        List<Transport> transports = transportService.getAllTransports();
        return new ResponseEntity<>(transports, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transport> getTransportById(@PathVariable String id) {
        Optional<Transport> transport = transportService.getTransportById(id);
        return transport.map(t -> new ResponseEntity<>(t, HttpStatus.OK))
                        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transport> updateTransport(@PathVariable String id, @RequestBody Transport transport) {
        Transport updatedTransport = transportService.updateTransport(id, transport);
        return updatedTransport != null ? new ResponseEntity<>(updatedTransport, HttpStatus.OK)
                                        : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransport(@PathVariable String id) {
        transportService.deleteTransport(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
