package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
