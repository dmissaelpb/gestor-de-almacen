package com.backend.api.entity;

import javax.persistence.*;
import java.io.Serializable;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(boolean usuarios) {
        this.usuarios = usuarios;
    }

    public boolean getOperarios() {
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