package com.medicon.mediconnect_api.repository;

import com.medicon.mediconnect_api.model.Atendimento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AtendimentoRepository extends JpaRepository <Atendimento, Long> {
    @Query(
        "SELECT a FROM Atendimento a JOIN a.paciente p JOIN a.medico m WHERE CAST(a.data AS string) LIKE %?1% OR CAST(a.hora AS string) LIKE %?1% OR CAST(a.status AS string) = ?1 OR p.nome LIKE %?1% OR p.email LIKE %?1% OR CAST(p.dataNascimento AS string) LIKE %?1% OR p.grupoSanguineo LIKE %?1% OR p.sexo LIKE %?1% OR p.cep LIKE %?1% OR m.nome LIKE %?1% OR m.registroConselho LIKE %?1% OR m.telefone LIKE %?1% OR m.email LIKE %?1%"
    )List<Atendimento> busca(String termoBusca);
}
