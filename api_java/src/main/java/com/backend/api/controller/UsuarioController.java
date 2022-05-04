package com.backend.api.controller;

import com.backend.api.Mapper;
import com.backend.api.entity.Usuario;
import com.backend.api.model.MUsuario;
import com.backend.api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")  // general busqueda
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario>
    getUsusarios(){

        return usuarioService.findAll();
    }

    @PostMapping("/usuario/buscar") //****** unica de usuario
    public ResponseEntity<?> findUsuario(@RequestBody Usuario usuario){
        Usuario usuarioDb = usuarioService.findUsuario(usuario);
        if(usuarioDb!=null) {
            return new ResponseEntity<>(usuarioDb, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }



    @PostMapping("/sign_up")  //****** unica de usuario
    public ResponseEntity<Void> addUsuario(@RequestBody Usuario usuario){
        if(usuarioService.findUsuario(usuario)==null) {
            usuarioService.save(usuario);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

    @PostMapping("login") //****** unica de usuario
    public ResponseEntity<?> loginUsuario(@RequestBody Usuario usuario){
        Usuario usuarioDb = usuarioService.checkUsuarioLogin(usuario);
        if(usuarioDb!=null) {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(usuarioDb);
            List<MUsuario> Usuarios = new ArrayList<>();
            Usuarios = Mapper.convertirLista(usuarios);
            return new ResponseEntity<>(Usuarios, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/usuario/update/{id}")  //*********************
    public ResponseEntity<?> updateUsuario(@PathVariable(value="id")Long id, @RequestBody Usuario usuario){
        Usuario usuarioDB = null;
        usuarioDB = usuarioService.findById(id);
        if(usuarioDB != null) {
            usuarioDB.setEmail(usuario.getEmail());
            usuarioDB.setNombre(usuario.getNombre());
            usuarioDB.setFoto(usuario.getFoto());
            usuarioService.uptadeUsuario(usuarioDB);
            return new ResponseEntity<>(usuarioDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/actualizar_sql")
    public ResponseEntity<?> updateUsuarioSql(@RequestBody Usuario usuario){
        Usuario usuarioDb = null;
        usuarioDb = usuarioService.findByIdSQL(usuario.getId());
        if(usuarioDb != null) {
            usuarioDb.setEmail(usuario.getEmail());
            usuarioDb.setNombre(usuario.getNombre());
            usuarioDb.setFoto(usuario.getFoto());
            usuarioService.uptadeUsuario(usuarioDb);
            return new ResponseEntity<>(usuarioDb, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{id}") //***************
    public ResponseEntity<Void> deleteUsuario(@PathVariable(value="id")Long id){
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("eliminar_post")
    public ResponseEntity<Void> deleteUsuarioPost(@RequestBody Usuario usuario){
        if(usuarioService.findUsuario(usuario)!=null) {
            usuarioService.deleteUsuario(usuario);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }


}
