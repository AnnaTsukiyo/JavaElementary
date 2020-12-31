package com.savchenko.bookstore.rest;

import com.savchenko.bookstore.model.Client;
import com.savchenko.bookstore.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public Iterable<Client> getClients (@RequestBody Client client) {
        return clientService.getClients();
    }
}