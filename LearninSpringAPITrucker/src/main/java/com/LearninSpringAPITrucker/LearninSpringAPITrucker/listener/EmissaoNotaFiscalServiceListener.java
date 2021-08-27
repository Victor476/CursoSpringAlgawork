/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.listener;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.service.ClientAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author victor
 */
@Component
public class EmissaoNotaFiscalServiceListener {

    @EventListener
    public void clientAtivadoListener(ClientAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para cliente " +
            event.getCliente().getNome());
    }
}
