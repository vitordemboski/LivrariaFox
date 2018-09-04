/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author vitor.7716
 */
@Controller
public class CadastroClienteController {
    @RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
    public String evento() {
        return "cadastro";
    }
}
