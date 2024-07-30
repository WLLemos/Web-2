package com.medicon.mediconnect_api.repository;

import com.medicon.mediconnect_api.model.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
    @Query(
        "SELECT p FROM Paciente p WHERE p.nome LIKE %?1% OR p.email LIKE %?1% OR p.telefone LIKE %?1% OR CAST(p.dataNascimento AS string) LIKE %?1% OR p.grupoSanguineo LIKE %?1% OR p.sexo LIKE %?1% OR p.cep LIKE %?1%"
    )List<Paciente> busca(String termoBusca);
}
