/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.service;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;

/**
 *
 * @author victor
 */
public class ClientAtivadoEvent {
    
    private Cliente cliente;

    public ClientAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
}
