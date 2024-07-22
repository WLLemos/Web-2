package com.medicon.mediconnect_api.controller;

import com.medicon.mediconnect_api.model.Medico;
import com.medicon.mediconnect_api.model.Paciente;
import com.medicon.mediconnect_api.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController implements IController<Medico> {

    @Autowired
    private MedicoService servico;

    @Override
    @GetMapping("/")
    public ResponseEntity<List<Medico>> get() {
        List<Medico> registros = servico.get();
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Medico> get(Long id) {
        Medico registro = servico.get(id);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @GetMapping("/busca/{termoBusca}")
    public ResponseEntity<List<Medico>> get(String termoBusca) {
        return null;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Medico> insert(Medico objeto) {
        Medico registro = servico.save(objeto);
        return new ResponseEntity<>(registro, HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Medico> update(Medico objeto) {
        Medico registro = servico.save(objeto);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/id")
    public ResponseEntity<?> delete(Long id) {
        servico.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
