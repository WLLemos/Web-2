package com.medicon.mediconnect_api.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IController<T> {
    public ResponseEntity<List<T>> get();
    public ResponseEntity<T> get(Long id);
    public ResponseEntity<List<T>> get(String termoBusca);
    public ResponseEntity<T> insert(T objeto);
    public ResponseEntity<T> update(T objeto);
    public ResponseEntity<?> delete(Long id);
}
