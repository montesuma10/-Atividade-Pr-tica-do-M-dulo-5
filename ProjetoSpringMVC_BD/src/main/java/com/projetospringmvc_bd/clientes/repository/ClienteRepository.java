package com.projetospringmvc_bd.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringmvc_bd.clientes.model.Cliente;
 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}