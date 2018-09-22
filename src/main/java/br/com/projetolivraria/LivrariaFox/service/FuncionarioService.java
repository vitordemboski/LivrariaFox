/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.service;


import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.models.Funcionario;
import br.com.projetolivraria.LivrariaFox.repository.FuncionarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vitor.7716
 */
@Service("funcionarioService")
@Transactional
public class FuncionarioService {
        @Autowired
    private FuncionarioRepository rc;
    
         public Funcionario findByUsernameAndPassword(String usuario, String senha) {
             
        return rc.findByUsuarioAndSenha(usuario, senha);
    
         }
    public List<Funcionario> findAll(){
        return rc.findAll();
    }
    
    public Funcionario save(Funcionario funcionario){
        return rc.saveAndFlush(funcionario);
    }
    
}
