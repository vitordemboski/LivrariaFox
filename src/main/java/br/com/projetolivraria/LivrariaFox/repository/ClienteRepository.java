/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.repository;

import br.com.projetolivraria.LivrariaFox.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>  {
  
}
