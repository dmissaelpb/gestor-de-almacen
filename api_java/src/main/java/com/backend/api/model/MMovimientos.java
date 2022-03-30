package com.backend.api.model;
import com.backend.api.entity.Movimientos;

import java.util.Date;

public class MMovimientos {
    private Long id;
    private int deltaX;
    private int deltaY;
    private int deltaZ;
    private int ubicacion;
    private Date createAt;

    public MMovimientos() {
    }

    public MMovimientos(Long id,  int deltaX, int deltaY, int deltaZ, int ubicacion, Date createAt) {
        super();
        this.id = id;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.deltaZ = deltaZ;
        this.ubicacion = ubicacion;
        this.createAt = createAt;
    }
    public MMovimientos(Movimientos movimientos){
        this.id = id;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.deltaZ = deltaZ;
        this.ubicacion = ubicacion;
        this.createAt = createAt;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
