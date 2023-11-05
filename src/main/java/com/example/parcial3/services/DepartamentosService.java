/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial3.services;

import com.example.parcial3.modelos.Departamentos;
import com.example.parcial3.repos.DepartamentosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabyt
 */

@Service
public class DepartamentosService {
    
    @Autowired
    DepartamentosRepository departamentosRepository;
    
    

    public List<Departamentos> obtenerDepartamentos(){
        
        return (List<Departamentos>)departamentosRepository.findAll();
    }
    
   
    
}
