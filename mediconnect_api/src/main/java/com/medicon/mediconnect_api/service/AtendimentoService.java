package com.medicon.mediconnect_api.service;

import com.medicon.mediconnect_api.model.Atendimento;
import com.medicon.mediconnect_api.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService implements IService<Atendimento> {

    @Autowired
    private AtendimentoRepository repo;

    @Override
    public List<Atendimento> get() {
        return repo.findAll();
    }

    @Override
    public Atendimento get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Atendimento> get(String termoBusca) {
        return repo.busca(termoBusca);
    }

    @Override
    public Atendimento save(Atendimento objeto) {
        return repo.save(objeto);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
