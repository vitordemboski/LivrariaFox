/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.repository.ClienteRepository;
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
 * @author usuario
 */
@Controller
public class LoginController {
    @Autowired
    private ClienteService cs;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap modelMap) {
        modelMap.put("cliente", new Cliente());
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logar(@ModelAttribute("cliente") Cliente cliente, ModelMap modelMap, HttpSession session){       
        if (cs.findByUsernameAndPassword(cliente.getUsuario(), cliente.getSenha())!=null) {
          session.setAttribute("usuario", cliente.getUsuario());
            return "index"; 
        }else{
            modelMap.put("error", "Usuário invalido");
         return "login";
        }
      
    }
}
