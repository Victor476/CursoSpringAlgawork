/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.service;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.NivelUrgencia;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.Notificador;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.NotificarEmail;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.TipoDoNotificador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author victor
 */

@Component
public class AtivacaoClienteService {
    
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;
    
    public void ativar(Cliente cliente){
        cliente.ativar();
        
        notificador.notificar(cliente, "Seu cadastro no Sistema está "
                + "ativo"); 
    }
    
}
