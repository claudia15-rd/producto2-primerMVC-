package com.Producto2.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {
    @Autowired private ClienteRepositorio repo;

    public List<Cliente> listAllClientes() {
        return  (List<Cliente>) repo.findAll();

    }
}
