/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker;

import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo.Cliente;
import com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/**
 *
 * @author victor
 */
public class MeuTerceiroController {
    
    AtivacaoClienteService ativacaoCliente;

    public MeuTerceiroController(AtivacaoClienteService ativacaoCliente) {
        this.ativacaoCliente = ativacaoCliente;
        
        System.out.println("Meu Terceiro Controller" + ativacaoCliente);
    }
    
    
    @ResponseBody
    @GetMapping("/hello")
    public String heloo(){
        Cliente joao = new Cliente("João","joao@xyz.com", "3499998888");
        
        ativacaoCliente.ativar(joao);
        
        return "Ola";
    }
}
