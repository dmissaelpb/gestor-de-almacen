package com.backend.api.model;

import com.backend.api.entity.Usuario;

import javax.persistence.*;
import java.util.Date;

public class MUsuario {
    private Long id;
    private String nombre;
    private String email;
    private String password;
    private String foto;
    private String rol;
    private int activo;
    private String estado;
    private Date createAt;

    public MUsuario() {
    }

    public MUsuario(Long id, String nombre, String email, String password, String foto, String rol, int activo, String estado, Date createAt) {
        super();
        this.id = id;  //***
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.foto = foto;
        this.rol = rol;
        this.activo = activo;
        this.estado = estado;
        this.createAt = createAt; //**** tieme
    }

    public MUsuario(Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.foto = foto;
        this.rol = rol;
        this.activo = activo;
        this.estado = estado;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
