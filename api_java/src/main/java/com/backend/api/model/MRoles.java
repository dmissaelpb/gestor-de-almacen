package com.backend.api.model;
import com.backend.api.entity.Roles;
import com.backend.api.entity.TiposDeMateriales;

import java.util.Date;

public class MRoles {
    private Long id;
    private boolean administrador;
    private boolean usuarios;
    private boolean operarios;

    public MRoles() {
    }

    public  MRoles(Long id, boolean administrador,boolean usuarios, boolean operarios){
        super();
        this.id =id;
        this.administrador = administrador;
        this.usuarios = usuarios;
        this.operarios = operarios;
    }

    public  MRoles(TiposDeMateriales MRoles){
        this.id =id;
        this.administrador = administrador;
        this.usuarios = usuarios;
        this.operarios = operarios;
    }

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
