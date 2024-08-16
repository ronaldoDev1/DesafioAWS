package com.example.crud.controller;

import com.example.crud.model.Escola;
import com.example.crud.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    @Autowired
    private EscolaRepository repository;

    @GetMapping
    public List<Escola> listar (){
        return repository.findAll();
    }

    @PostMapping
    public void adicionar(@RequestBody Escola escola){
        repository.save(escola);
    }

    @PutMapping
    public Escola alterar(@RequestBody Escola escola) {
        if (escola.getId() > 0)
            return repository.save(escola);
        return null;
    }

    @DeleteMapping
    public String deletar(@RequestBody Escola escola){
        if(escola.getId()>0) {
            repository.delete(escola);
            return "removido";
        }
        return "nao escontrado";
    }

    @GetMapping("/{id}")
    public Escola buscarPorId(@PathVariable Long id) {
        var escola = repository.findById(id).orElse(null);
        return escola;
    }

    @DeleteMapping("/{id}")
    public String deletarPorId(@PathVariable Long id) {
        var escola = repository.findById(id).orElse(null);
        if (escola != null) {
            repository.deleteById(id);
            return "removido";
        }
        return "não encontrado";
    }

}

