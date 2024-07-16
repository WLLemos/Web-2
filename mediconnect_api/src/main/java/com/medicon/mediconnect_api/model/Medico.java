package com.medicon.mediconnect_api.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String registroConselho;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
}
