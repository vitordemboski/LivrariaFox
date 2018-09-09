/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.service;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import br.com.projetolivraria.LivrariaFox.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vitor.7716
 */
@Service("clienteService")
@Transactional
public class ClienteServiceimpl implements ClienteService{
     @Autowired
    private ClienteRepository rc;
    
    public List<Cliente> findAll(){
        return rc.findAll();
    }
    
    public Cliente save(Cliente cliente){
        return rc.saveAndFlush(cliente);
    }

    @Override
    public Cliente findByUsernameAndPassword(String username, String password) {

        return rc.findByUsernameAndPassword(username, password);
    }
   
}
