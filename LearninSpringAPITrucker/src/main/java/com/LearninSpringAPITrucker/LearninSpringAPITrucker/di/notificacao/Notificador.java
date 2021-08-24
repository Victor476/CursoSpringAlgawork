/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;

/**
 *
 * @author victor
 */
public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
    
}
