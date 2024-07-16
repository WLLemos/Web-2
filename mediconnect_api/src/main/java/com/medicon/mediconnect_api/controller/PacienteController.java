package com.medicon.mediconnect_api.controller;

import com.medicon.mediconnect_api.model.Paciente;
import com.medicon.mediconnect_api.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController implements IController<Paciente>{

    @Autowired
    private PacienteService servico;

    @Override
    @GetMapping("/")
    public ResponseEntity<List<Paciente>> get() {
        List<Paciente> registros = servico.get();
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> get(Long id) {
        Paciente registro = servico.get(id);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @GetMapping("/busca/{termoBusca}")
    public ResponseEntity<List<Paciente>> get(String termoBusca) {
        return null;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Paciente> insert(Paciente objeto) {
        Paciente registro = servico.save(objeto);
        return new ResponseEntity<>(registro, HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/")
    public ResponseEntity<Paciente> update(Paciente objeto) {
        Paciente registro = servico.save(objeto);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/id")
    public ResponseEntity<?> delete(Long id) {
        servico.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
