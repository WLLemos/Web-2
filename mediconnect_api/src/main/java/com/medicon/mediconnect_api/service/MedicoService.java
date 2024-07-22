package com.medicon.mediconnect_api.service;

import com.medicon.mediconnect_api.model.Medico;
import com.medicon.mediconnect_api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements IService<Medico> {
    @Autowired
    private MedicoRepository repo;
    @Override
    public List<Medico> get() {
        return repo.findAll();
    }

    @Override
    public Medico get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Medico> get(String termoBusca) {
        return null;
    }

    @Override
    public Medico save(Medico objeto) {
        return repo.save(objeto);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
