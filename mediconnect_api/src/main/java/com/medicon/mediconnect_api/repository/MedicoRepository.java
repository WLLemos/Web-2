package com.medicon.mediconnect_api.repository;

import com.medicon.mediconnect_api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository <Medico, Long> {
}
