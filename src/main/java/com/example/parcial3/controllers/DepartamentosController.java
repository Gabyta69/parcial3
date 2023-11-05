/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial3.controllers;

import com.example.parcial3.modelos.Departamentos;
import com.example.parcial3.services.DepartamentosService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabyt
 */


@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {
    
    @Autowired
    DepartamentosService departamentosService;  //
    
    @GetMapping()
    public List<Departamentos> obtenerDepartamentos(){
        return departamentosService.obtenerDepartamentos();
    }
    
}
