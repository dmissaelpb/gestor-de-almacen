package com.backend.api.controller;

import com.backend.api.entity.Inventarios;
import com.backend.api.entity.TiposDeMateriales;
import com.backend.api.service.ITiposDeMaterialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/tiposDeMateriales/update/{id}")
    public ResponseEntity<?> updateTiposDeMaterial(@PathVariable
     (value="id")Long id, @RequestBody TiposDeMateriales tiposDeMateriales){
        TiposDeMateriales tiposDeMaterialesDB = null;
        tiposDeMaterialesDB =  tiposDeMaterialesService.findById(id);
        if(tiposDeMaterialesDB != null) {
            tiposDeMaterialesDB.setNombreProducto(tiposDeMateriales.getNombreProducto());
            tiposDeMaterialesDB.setReactividadQuimica(tiposDeMateriales.getReactividadQuimica());
            tiposDeMaterialesDB.setCantidad(tiposDeMateriales.getCantidad());
            tiposDeMaterialesDB.setModifiedDateTiposDeMateriales(tiposDeMateriales.getModifiedDateTiposDeMateriales());
            tiposDeMaterialesService.uptadeTiposDeMateriales(tiposDeMaterialesDB);
            return new ResponseEntity<>(tiposDeMaterialesDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/tiposDeMateriales/agregar")
    public ResponseEntity<Void> addTiposDeMateriales (@RequestBody TiposDeMateriales tiposDeMateriales){
        if(tiposDeMaterialesService.findTiposDeMateriales(tiposDeMateriales.getId())==null) {
            tiposDeMaterialesService.agregarTiposDeMateriales(tiposDeMateriales);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }



    @DeleteMapping("/tiposDeMateriales/eliminar/{id}") //*************** eliminar
    public ResponseEntity<Void> deleteMovimientos
            (@PathVariable(value="id")Long id){
        tiposDeMaterialesService.deleteTiposDeMateriales(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/tiposDeMateriales/buscar_tiposDeMateriales") //******
    public ResponseEntity<?> findTiposDeMateriales (@RequestBody Inventarios inventarios) {
        TiposDeMateriales tiposDeMaterialesDB = tiposDeMaterialesService.findById(inventarios.getId());
        if (tiposDeMaterialesDB != null) {
            return new ResponseEntity<>(tiposDeMaterialesDB, HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }


}
