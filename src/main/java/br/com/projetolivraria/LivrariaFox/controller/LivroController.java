/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.models.Livro;
import br.com.projetolivraria.LivrariaFox.service.LivroService;
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
public class LivroController {
     @Autowired
    private LivroService cs;
        @RequestMapping(value = "/aparecerDados", method = RequestMethod.GET)
    public String dados() {
        return "pagina-livro";
    }
    
@RequestMapping(value = "/cadastrarLivro", method = RequestMethod.POST)
    public String cadastrar(@ModelAttribute("livro") Livro livro, ModelMap modelMap, HttpSession session){       
        if (livro!=null) {   
          cs.save(livro);
            return "index"; 
        }else{
            modelMap.put("error", "Cadastro invalido");
         return "?";
        }
      
    }
    
}
