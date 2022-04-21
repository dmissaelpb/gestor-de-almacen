package com.backend.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class TiposDeMateriales implements  Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombreProducto")
    private int nombreProducto ;

    @Column(name="cantidad")
    private boolean cantidad;

    @Column(name="reactividadQuimica")
    private boolean reactividadQuimica ;

    @Column(name= "modifiedDateTiposDeMateriales")
    @Temporal(TemporalType.DATE)
    private Date modifiedDateTiposDeMateriales;

    @PrePersist
    public void prePersist() {
        modifiedDateTiposDeMateriales = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(int nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public boolean getCantidad() {
        return cantidad;
    }

    public void setCantidad(boolean cantidad) {
        this.cantidad = cantidad;
    }

    public boolean getReactividadQuimica() {
        return reactividadQuimica;
    }

    public void setReactividadQuimica(boolean reactividadQuimica) {
        this.reactividadQuimica = reactividadQuimica;
    }

    public Date getModifiedDateTiposDeMateriales() {
        return modifiedDateTiposDeMateriales;
    }

    public void setModifiedDateTiposDeMateriales(Date modifiedDateTiposDeMateriales) {
        this.modifiedDateTiposDeMateriales = modifiedDateTiposDeMateriales;
    }
}
