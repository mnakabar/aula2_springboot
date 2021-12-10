package com.developper.aula2springboot.controller;


import com.developper.aula2springboot.model.Cliente;
import com.developper.aula2springboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> teste(){
        return clienteRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente aicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
