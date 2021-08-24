/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.notificacao;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 * @author victor
 */
@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificarEmailMOCK implements Notificador  {            
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("MOCK: Notificação seria enviada %s através do e-mail %s:%s\n"
        ,cliente.getNome(),cliente.getEmail(),mensagem);
    }
}
