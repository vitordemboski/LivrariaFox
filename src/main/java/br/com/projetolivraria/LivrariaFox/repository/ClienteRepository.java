/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.repository;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
   
  public Cliente findByUsuarioAndSenha(String usuario,String senha);  
    
}
