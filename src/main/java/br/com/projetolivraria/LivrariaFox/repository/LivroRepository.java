/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.repository;

import br.com.projetolivraria.LivrariaFox.models.Livro;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    public Livro findById(long id);

}
