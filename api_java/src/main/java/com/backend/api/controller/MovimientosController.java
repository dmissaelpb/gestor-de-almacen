package com.backend.api.controller;

import com.backend.api.entity.Movimientos;
import com.backend.api.service.IMovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MovimientosController {

    @Autowired
   private IMovimientosService movimientosService;


    @GetMapping("/movimientos")  // general busqueda EspaciosControlador
    @ResponseStatus(HttpStatus.OK)
    public List<Movimientos> getMoviminetos(){
        return movimientosService.findAll();
    }

    @PutMapping("/movimientos/update/{id}")  //*********************     coregir segmento de variables
    public ResponseEntity<?> uptadeEspacios(@PathVariable
                                                    (value="id")Long id, @RequestBody Movimientos  movimientos){
        Movimientos movimientosDB = null;
        movimientosDB =  movimientosService.findById(id);
        if(movimientosDB != null) {

            movimientosDB.setDeltaX(movimientos.getDeltaX());
            movimientosDB.setDeltaY(movimientos.getDeltaY());
            movimientosDB.setDeltaZ(movimientos.getDeltaZ());
            movimientosDB.setUbicacion(movimientos.getUbicacion());
            movimientosService.uptadeMovimientos(movimientosDB);
            return new ResponseEntity<>(movimientosDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/movimientos/agregar")
    public ResponseEntity<Void> addMoviminetos (@RequestBody Movimientos movimientos){
        if(movimientosService.findMovimientos(movimientos.getId())==null) {
            movimientosService.agregarMovimientos(movimientos);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/movimientos/eliminar/{id}") //*************** eliminar
    public ResponseEntity<Void> deleteMovimientos
            (@PathVariable(value="id")Long id){
        movimientosService.deleteMoviminetos(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PostMapping("/movimientos/buscar") //******
    public ResponseEntity<?> findMovimientos(@RequestBody Movimientos movimientos) {
        Movimientos movimientosDB = movimientosService.findById(movimientos.getId());
        if (movimientosDB != null) {
            return new ResponseEntity<>(movimientosDB, HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }



}
