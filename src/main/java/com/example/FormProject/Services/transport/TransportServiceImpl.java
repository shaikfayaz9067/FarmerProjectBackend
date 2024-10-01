package com.example.FormProject.Services.transport;

import com.example.FormProject.Model.Transport;
import com.example.FormProject.Repository.TransportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportServiceImpl implements TransportService {

    @Autowired
    private TransportRepository transportRepository;

    @Override
    public Transport createTransport(Transport transport) {
        return transportRepository.save(transport);
    }

    @Override
    public List<Transport> getAllTransports() {
        return transportRepository.findAll();
    }

    @Override
    public Optional<Transport> getTransportById(String id) {
        return transportRepository.findById(id);
    }

    @Override
    public Transport updateTransport(String id, Transport transport) {
        if (transportRepository.existsById(id)) {
            transport.setId(id);
            return transportRepository.save(transport);
        } else {
            return null; // Or throw an exception
        }
    }

    @Override
    public void deleteTransport(String id) {
        transportRepository.deleteById(id);
    }
}

