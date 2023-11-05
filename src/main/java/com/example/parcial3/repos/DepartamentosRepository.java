/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.parcial3.repos;

import com.example.parcial3.modelos.Departamentos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabyt
 */

@Repository
public interface DepartamentosRepository extends CrudRepository<Departamentos, Integer> {
    
 
    
     @Override
     List<Departamentos> findAll();
}
