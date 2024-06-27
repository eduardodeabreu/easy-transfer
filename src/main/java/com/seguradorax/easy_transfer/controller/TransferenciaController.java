package com.seguradorax.easy_transfer.controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguradorax.easy_transfer.entity.Transferencia;
import com.seguradorax.easy_transfer.service.TransferenciaService;


@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    private final TransferenciaService transferenciaService;

    public TransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @PostMapping
    public Transferencia agendarTransferencia(@RequestBody Transferencia transferencia) {
        return transferenciaService.agendarTransferencia(transferencia);
    }

    @GetMapping
    public List<Transferencia> listarTransferencias() {
        return transferenciaService.listarTransferencias();
    }
}
