package com.medicon.mediconnect_api.controller;

import com.medicon.mediconnect_api.model.Atendimento;
import com.medicon.mediconnect_api.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class AtendimentoController implements IController<Atendimento>{
    @Autowired
    private AtendimentoService servico;

    @Override
    @GetMapping("/")
    public ResponseEntity<List<Atendimento>> get() {
        List<Atendimento> registros = servico.get();
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Atendimento> get(Long id) {
        Atendimento registro = servico.get(id);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @GetMapping("/busca/{termobusca}")
    public ResponseEntity<List<Atendimento>> get(String termoBusca) {
        List<Atendimento> registros = servico.get(termoBusca);
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Atendimento> insert(Atendimento objeto) {
        Atendimento registro = servico.save(objeto);
        return new ResponseEntity<>(registro, HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Atendimento> update(Atendimento objeto) {
       Atendimento registro = servico.save(objeto);
       return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @PostMapping("/id")
    public ResponseEntity<?> delete(Long id) {
        servico.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
