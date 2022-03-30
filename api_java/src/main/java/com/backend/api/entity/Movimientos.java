package com.backend.api.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Movimientos implements Serializable  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="deltaX")
    private int deltaX;

    @Column(name="deltaY")
    private int deltaY;

    @Column(name="deltaZ")
    private int deltaZ;


    @Column(name="ubicacion")
    private int ubicacion;



    @Column(name= "modifieDate")
    @Temporal(TemporalType.DATE)
    private Date modifieDate;

    @PrePersist
    public void prePersist() {
        modifieDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    public int getDeltaZ() {
        return deltaZ;
    }

    public void setDeltaZ(int deltaZ) {
        this.deltaZ = deltaZ;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getModifieDate() {
        return modifieDate;
    }

    public void setModifieDate(Date modifieDate) {
        this.modifieDate = modifieDate;
    }
}
