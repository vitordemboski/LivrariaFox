/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.controller;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.models.Livro;
import br.com.projetolivraria.LivrariaFox.service.LivroService;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author usuario
 */
    @Controller //Responsável tanto por receber requisições como por enviar a resposta ao usuário
public class IndexController {
        @Autowired
       private LivroService ls;
        

    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView listaLivros(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) throws FileNotFoundException, IOException {
        ModelAndView mv = new ModelAndView("index"); // é utilizada para especificar a view que será renderizada e quais os dados ela utilizará para isso.  
        List<Livro> livros = ls.findAll();
       // response.setContentType("image/jpeg");
        // ServletOutputStream outputStream = response.getOutputStream();
        for (Livro livro : livros) {
          //  outputStream.write(livro.getCapa());
           // outputStream.close();
        }
        //Iterable é uma interface que determina que uma coleção pode ter seus elementos alcançados por uma estrutura foreach
        mv.addObject("livro", livros);
        return mv;
    }
   
}
