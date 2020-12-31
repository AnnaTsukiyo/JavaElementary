package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Client;
import com.savchenko.bookstore.dao.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientDAO clientDAO;

    @Override
    public Client createClient(Client client) {
        return clientDAO.save(client);
    }

    @Override
    public Iterable<Client> getClients() {
        return clientDAO.findAll();
    }

    @Override
    public Optional<Client> getClient(Long clientId) {
        return clientDAO.findById(clientId);
    }
}

