package com.backend.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Roles implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "administrador")
    private boolean administrador;

    @Column(name = "usuarios")
    private boolean usuarios;

    @Column(name="operarios")
    private boolean operarios;
/*
    @Column(name= "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;*/

    @PrePersist
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean isUsuarios() {
        return usuarios;
    }

    public void setUsuarios(boolean usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isOperarios() {
        return operarios;
    }

    public void setOperarios(boolean operarios) {
        this.operarios = operarios;
    }
}



 //   consultas, general(find all) y por id
//      agregar add
//  elieminar
// actualizar