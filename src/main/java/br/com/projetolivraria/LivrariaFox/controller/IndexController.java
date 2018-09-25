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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author usuario
 */
    @Controller //Responsável tanto por receber requisições como por enviar a resposta ao usuário
public class IndexController {
        @Autowired
       private LivroService ls;
        
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("livro", new Livro());
        return "index";
    }
    
    @RequestMapping(value = "/todos")
    public ModelAndView listaLivros() {
        ModelAndView mv = new ModelAndView("index"); // é utilizada para especificar a view que será renderizada e quais os dados ela utilizará para isso.  
        Iterable<Livro> livros = ls.findAll();
        //Iterable é uma interface que determina que uma coleção pode ter seus elementos alcançados por uma estrutura foreach
        mv.addObject("livro", livros);
        return mv;
    }
}
