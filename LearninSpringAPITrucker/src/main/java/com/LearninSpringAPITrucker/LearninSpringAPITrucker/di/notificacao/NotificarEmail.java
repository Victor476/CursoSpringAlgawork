/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author victor
 */
@Profile("production")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificarEmail implements Notificador  {            
    
    @Autowired
    private NotificadorProperties properties;
    
    
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());
        
        System.out.printf("Notificando %s através do e-mail %s:%s\n"
            ,cliente.getNome(),cliente.getEmail(),mensagem);
    }
}
