/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.service.ClienteService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author vitor.7716
 */
@Controller
public class CadastroClienteController {
    
    @Autowired
    private ClienteService cs;
    
    @RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
    public String evento(ModelMap modelMap) {
        modelMap.put("cliente", new Cliente());
        return "cadastro";
    }
    
    @RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
    public String cadastrar(@ModelAttribute("cliente") Cliente cliente, ModelMap modelMap, HttpSession session){       
        if (cliente!=null) {   
          cs.save(cliente);
            return "index"; 
        }else{
            modelMap.put("error", "Cadastro invalido");
         return "cadastro";
        }
      
    }
   
}
