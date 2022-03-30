package com.backend.api.model;


import com.backend.api.entity.Usuario;

import javax.persistence.*;
import java.util.Date;


public class MEspacios {

    private int x;
    private int y;
    private int z;

    private Date modifieDateXYZ;

    public MEspacios(){

    }

    public  MEspacios(int x, int y, int z, Date modifieDateXYZ ){
        super();
            this.x = x;
        this.y = y;
        this.z = z;
        this.modifieDateXYZ = modifieDateXYZ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Date getModifieDateXYZ() {
        return modifieDateXYZ;
    }

    public void setModifieDateXYZ(Date modifieDateXYZ) {
        this.modifieDateXYZ = modifieDateXYZ;
    }
}
