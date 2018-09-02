/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author usuario
 */
@Controller
public class LoginController {
    
    

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String evento() {
        return "login";
    }
    

}
