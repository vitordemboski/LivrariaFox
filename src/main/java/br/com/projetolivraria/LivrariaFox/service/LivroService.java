/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.service;

import br.com.projetolivraria.LivrariaFox.models.Livro;
import br.com.projetolivraria.LivrariaFox.repository.LivroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vitor.7716
 */
@Service("livroService")
@Transactional
public class LivroService {
    @Autowired
    private LivroRepository rc;
    
    public List<Livro> findAll(){
        return rc.findAll();
    }
    
    public Livro save(Livro livro){
        return rc.saveAndFlush(livro);
    }
    public Livro fieldByLivro(long id){
        return rc.findById(id);
    }
    
}
