/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial3.services;


import com.example.parcial3.modelos.Municipios;
import com.example.parcial3.repos.MunicipiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabyt
 */


@Service
public class MunicipioService  {

    @Autowired
    private MunicipiosRepository municipiosRepository;

  
    public List<Municipios> obtenerMunicipios() {
        return municipiosRepository.findAll();
    }
}
