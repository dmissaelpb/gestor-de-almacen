package com.backend.api.controller;


import com.backend.api.entity.Espacios;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.api.service.IRolesService;
import com.backend.api.entity.Roles;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    @Autowired
    private IRolesService rolesService;

    @GetMapping("/roles")
    @ResponseStatus(HttpStatus.OK)
    public List<Roles> getRoles() {
        return rolesService.findAll();

    }
    
            @PutMapping("/update/{id}")  //*********************     coregir segmento de variables 
            public ResponseEntity<?> updateRoles(@PathVariable
            (value="id")Long id, @RequestBody Roles roles){

                Roles rolesDB = null;
                rolesDB = rolesService.findById(id);
                if(rolesDB != null) {

                    return new ResponseEntity<>(rolesDB, HttpStatus.OK);
                }else {
                    return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
                }
            }

    @PostMapping("/agregar")
    public ResponseEntity<Void> addRoles(@RequestBody Roles roles){
        if(rolesService.findRoles(roles.getId())==null) {
            rolesService.agregarRoles(roles);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/eliminar/{id}") //*************** eliminar
    public ResponseEntity<Void> deleteRoles(@PathVariable(value="id")Long id){
        rolesService.deleteRoles(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/buscar_espacios") //******
    public ResponseEntity<?> findRoles(@RequestBody Roles roles){
        Roles rolesDB = rolesService.findById(roles.getId());
        if(rolesDB!=null) {
            return new ResponseEntity<>(rolesDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }






    }
