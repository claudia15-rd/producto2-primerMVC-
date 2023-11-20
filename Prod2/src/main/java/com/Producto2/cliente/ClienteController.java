package com.Producto2.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {
    @Autowired private ClienteServicio servicio;

    @GetMapping("/clientes")
    public String mostrarClientesListado(Model model) {
        List<Cliente> listaClientes= servicio.listAllClientes();
        model.addAttribute("listAllClientes",listaClientes);

        return "clientes";

    }

    @GetMapping("/clientes/AddUsuario")
    public String mostrarFormularioAñadirCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cliente_AddUsuario";

    }
}
