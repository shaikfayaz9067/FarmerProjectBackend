package com.example.FormProject.Services.transport;

import com.example.FormProject.Model.Transport;
import java.util.List;
import java.util.Optional;

public interface TransportService {
    Transport createTransport(Transport transport);
    List<Transport> getAllTransports();
    Optional<Transport> getTransportById(String id);
    Transport updateTransport(String id, Transport transport);
    void deleteTransport(String id);
}
