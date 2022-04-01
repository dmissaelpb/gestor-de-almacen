package com.backend.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.api.service.IEspaciosService;
import com.backend.api.entity.Espacios;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class EspaciosControlador {
    @Autowired
    private IEspaciosService espaciosService;

    @GetMapping("/espacios")  // general busqueda EspaciosControlador
    @ResponseStatus(HttpStatus.OK)
    public List<Espacios> getEspacios(){
        return espaciosService.findAll();
    }


    @PutMapping("/update/{id}")  //*********************     coregir segmento de variables
    public ResponseEntity<?> updateEspacios(@PathVariable
   (value="id")Long id, @RequestBody Espacios  espacios){
        Espacios espaciosDB = null;
        espaciosDB =  espaciosService.findById(id);
        if(espaciosDB != null) {
            espaciosDB.setModifieDateXYZ(espacios.getModifieDateXYZ());
            espaciosDB.setX(espacios.getX());
            espaciosDB.setY(espacios.getY());
            espaciosDB.setZ(espacios.getZ());
            espaciosService.uptadeEspacios(espaciosDB);
            return new ResponseEntity<>(espaciosDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/agregar")
    public ResponseEntity<Void> addEspacios(@RequestBody Espacios espacios){
        if(espaciosService.findEspacios(espacios.getId())==null) {
            espaciosService.agregarEspacios(espacios);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/eliminar/{id}") //*************** eliminar
    public ResponseEntity<Void> deleteEspacios(@PathVariable(value="id")Long id){
        espaciosService.deleteEspacios(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/buscar_espacios") //******
    public ResponseEntity<?> findEspacios(@RequestBody Espacios espacios){
        Espacios espaciosDB = espaciosService.findById(espacios.getId());
        if(espaciosDB!=null) {
            return new ResponseEntity<>(espaciosDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }







}
