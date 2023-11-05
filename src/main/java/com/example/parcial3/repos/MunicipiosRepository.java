/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.parcial3.repos;


import com.example.parcial3.modelos.Municipios;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gabyt
 */
public interface MunicipiosRepository extends CrudRepository<Municipios, Integer> {
     
 
    @Override
    List<Municipios> findAll();
 
 
}
