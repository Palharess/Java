package br.com.palhares.exerciciossb.controllers;

import br.com.palhares.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "0882136567");
    }
    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Pedro", "0882136567");
    }
    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id){
        return new Cliente(id, "a", "0882136567");
    }
}
