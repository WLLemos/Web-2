package com.medicon.mediconnect_api.repository;

import com.medicon.mediconnect_api.model.Medico;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicoRepository extends JpaRepository <Medico, Long> {
    @Query(
        "SELECT m FROM Medico m WHERE m.nome LIKE %?1% OR m.registroConselho LIKE %?1% OR m.telefone LIKE %?1% OR m.email LIKE %?1%"
    )List<Medico> busca(String termoBusca);
}
