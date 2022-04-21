package com.backend.api.controller;

import com.backend.api.Mapper;
import com.backend.api.dao.IEspaciosDAO;
import com.backend.api.entity.Espacios;
import com.backend.api.entity.Inventarios;
import com.backend.api.model.MInventarios;
import com.backend.api.service.IEspaciosService;
import com.backend.api.service.IInventariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class InventariosControlador {

    @Autowired
    private IInventariosService inventariosService;

    @GetMapping("/inventarios")  // general busqueda
    @ResponseStatus(HttpStatus.OK)
    public List<Inventarios>
    getInventarios(){
        return inventariosService.findAll();
    }

    @PutMapping("/update/{id}")  //*********************     coregir segmento de variables
    public ResponseEntity<?> updateInventario(@PathVariable
   (value="id")Long id, @RequestBody Inventarios inventarios){
        Inventarios inventariosDB = null;
        inventariosDB =  inventariosService.findById(id);
        if(inventariosDB != null) {
            inventariosDB.setProductoBase(inventarios.getProductoBase());
            inventariosDB.setProducto(inventarios.getProducto());
            inventariosDB.setModelo(inventarios.getModelo());
            inventariosDB.setListPrice(inventarios.getListPrice());
            inventariosService.uptadeInventarios(inventariosDB);
            return new ResponseEntity<>(inventariosDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/agregar")
    public ResponseEntity<Void> addInventarios (@RequestBody Inventarios inventarios){
        if(inventariosService.findById(inventarios.getId())==null) {
            inventariosService.agregarInventarios(inventarios);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }


    @DeleteMapping("/eliminar/{id}") //*************** eliminar
    public ResponseEntity<Void> deleteInventarios(@PathVariable(value="id")Long id){
        inventariosService.deleteInventarios(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/buscar_Inventarios") //******
    public ResponseEntity<?> findInventarios(@RequestBody Inventarios inventarios) {
        Inventarios inventariosDB = inventariosService.findById(inventarios.getId());
        if (inventariosDB != null) {
            return new ResponseEntity<>(inventariosDB, HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}