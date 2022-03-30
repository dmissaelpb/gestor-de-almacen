package com.backend.api.controller;

import com.backend.api.Mapper;
import com.backend.api.entity.roles;
import com.backend.api.model.Mroles;
import com.backend.api.service.IrolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
                if(rolesDB != null) {/*
                    rolesDB.setEmail(roles.getEmail());
                    rolesDB.setNombre(roles.getNombre());
                    rolesDB.setFoto(roles.getFoto());
                    rolesService.uptadeRoles(rolesDB);*/
                    return new ResponseEntity<>(rolesDB, HttpStatus.OK);
                }else {
                    return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
                }
            }

            @PutMapping("/actualizar_sql") //********************coregir segmento de variables 
            public ResponseEntity<?> updateRolesSql(@RequestBody Roles roles){
                Roles rolesDB = null;
                rolesDB = rolesService.findByIdSQL(roles.getId());
                if(rolesDB != null) {
                    /*
                    rolesDB.setEmail(roles.getEmail());
                    rolesDB.setNombre(roles.getNombre());
                    rolesDB.setFoto(roles.getFoto());
                    rolesSeRoles(rolesDB);*/
                    return new ResponseEntity<>(rolesDB, HttpStatus.OK);
                }else {
                    return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
                }
            }


           

            @PutMapping("/actualizar_sql") //******************  coregir segmento de variables 
        public ResponseEntity<?> updaterolesSql(@RequestBody roles roles){
            roles rolesDB = null;
            rolesDB = rolesService.findByIdSQL(roles.getId());
            if(rolesDB != null) {/*
                rolesDB.setEmail(roles.getEmail());
                rolesDB.setNombre(roles.getNombre());
                rolesDB.setFoto(roles.getFoto());
                rolesSeRoles(rolesDB);*/
                return new ResponseEntity<>(rolesDB, HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        }


        @DeleteMapping("/eliminar/{id}") //***************
        public ResponseEntity<Void> deleteroles(@PathVariable(value="id")Long id){
            rolesService.deleteroles(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }








    }
