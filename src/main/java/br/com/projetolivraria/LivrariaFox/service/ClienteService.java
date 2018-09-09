/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.service;

import br.com.projetolivraria.LivrariaFox.models.Cliente;

/**
 *
 * @author usuario
 */
public interface ClienteService {
        public Cliente findByUsernameAndPassword(String username,String password);

}
