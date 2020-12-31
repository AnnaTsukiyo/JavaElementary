package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Client;

import java.util.Optional;

public interface ClientService {

    Client createClient(Client client);

    Iterable<Client> getClients();

    Optional<Client> getClient (Long clientId);
}
