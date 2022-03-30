package com.backend.api.controller;


import com.backend.api.Mapper;
import com.backend.api.entity.TiposDeMateriales;
import com.backend.api.model.MTiposDeMateriales;
import com.backend.api.service.ITiposDeMaterialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class TiposDeMaterialesController {

    @Autowired
    private ITiposDeMaterialesService tiposDeMaterialesService;


    @GetMapping("/tiposDeMateriales")
    @ResponseStatus(HttpStatus.OK)
    public List<TiposDeMateriales>
    getTiposDeMateriales(){
        return tiposDeMaterialesService.findAll();
    }













}
