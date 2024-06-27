package com.seguradorax.easy_transfer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seguradorax.easy_transfer.entity.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}