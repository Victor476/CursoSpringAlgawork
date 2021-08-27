/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.listener;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.NivelUrgencia;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.Notificador;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao.TipoDoNotificador;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.service.ClientAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author victor
 */
@Component
public class NotificacaoServiceListener {
    
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;
    
    @EventListener
    public void clientAtivadoListener(ClientAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
    
}
