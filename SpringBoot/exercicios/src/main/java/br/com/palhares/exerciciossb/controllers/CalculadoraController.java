package br.com.palhares.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

    @GetMapping
    public double somar(@RequestParam(name = "x") int x, @RequestParam(name = "y")int y){
        return x + y;
    }
    @GetMapping("/{x}/{y}")
    public double sb(@PathVariable int x, @PathVariable int y){
        return x + y;
    }

}
