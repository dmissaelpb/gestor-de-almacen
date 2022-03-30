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

    @Column(name= "modifieDateTiposDeMateriales")
    @Temporal(TemporalType.DATE)
    private Date modifieDateTiposDeMateriales;
    @PrePersist
    public void prePersist() {
        modifieDateTiposDeMateriales = new Date();
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

    public boolean isCantidad() {
        return cantidad;
    }

    public void setCantidad(boolean cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isReactividadQuimica() {
        return reactividadQuimica;
    }

    public void setReactividadQuimica(boolean reactividadQuimica) {
        this.reactividadQuimica = reactividadQuimica;
    }

    public Date getModifieDateTiposDeMateriales() {
        return modifieDateTiposDeMateriales;
    }

    public void setModifieDateTiposDeMateriales(Date modifieDateTiposDeMateriales) {
        this.modifieDateTiposDeMateriales = modifieDateTiposDeMateriales;
    }
}
