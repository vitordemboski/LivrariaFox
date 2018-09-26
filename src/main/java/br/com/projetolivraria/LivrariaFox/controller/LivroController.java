/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.models.Livro;
import br.com.projetolivraria.LivrariaFox.service.LivroService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping(value = "/cadastrarLivro", method = RequestMethod.GET)
    public String cadastro(ModelMap modelMap) {
        modelMap.put("livro", new Livro());
        return "cadastro-livro";
    }
    
@RequestMapping(value = "/cadastrarLivro", method = RequestMethod.POST)
    public String cadastrar(@ModelAttribute("livro") Livro livro,HttpServletRequest request, ModelMap modelMap, HttpSession session) throws IOException{       
        if (livro!=null) {
          MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file =  multipartRequest.getFile("imagem");
        livro.setCapa(file.getBytes());
          cs.save(livro);
            return "index"; 
        }else{
            modelMap.put("error", "Cadastro invalido");
         return "";
        }
    }
   
}
