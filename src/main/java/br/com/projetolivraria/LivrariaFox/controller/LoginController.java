/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.models.Funcionario;
import br.com.projetolivraria.LivrariaFox.models.Livro;
import br.com.projetolivraria.LivrariaFox.repository.ClienteRepository;
import br.com.projetolivraria.LivrariaFox.service.ClienteService;
import br.com.projetolivraria.LivrariaFox.service.FuncionarioService;
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
       @Autowired
    private FuncionarioService fs;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap modelMap) {
        modelMap.put("cliente", new Cliente());
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logar(@ModelAttribute("cliente") Cliente cliente, ModelMap modelMap, HttpSession session){       
        if (cs.findByUsernameAndPassword(cliente.getUsuario(), cliente.getSenha())!=null) {
          session.setAttribute("usuario", cliente.getUsuario());
            return "painel-cliente"; 
        }else{
            modelMap.put("error", "Usuário invalido");
         return "login";
        }
      
    }
    @RequestMapping(value = "/loginFunc", method = RequestMethod.GET)
    public String loginFunc(ModelMap modelMap) {
        modelMap.put("funcionario", new Funcionario());
        return "login-funcionarios";
    }
     @RequestMapping(value = "/loginFunc", method = RequestMethod.POST)
    public String logarFunc(@ModelAttribute("funcionario") Funcionario funcionario, ModelMap modelMap, HttpSession session){       
        if (fs.findByUsernameAndPassword(funcionario.getUsuario(), funcionario.getSenha())!=null) {
          session.setAttribute("funcionario", funcionario.getUsuario());
            return "painel-funcionario-editor"; 
        }else{
            modelMap.put("error", "Usuário invalido");
         return "login-funcionarios";
        }
    }
    
        @RequestMapping(value = "/PaginaPrincipal")
    public String sair( ) {
        return "index";
    }
}
