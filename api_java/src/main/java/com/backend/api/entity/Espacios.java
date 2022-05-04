package com.backend.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Espacios  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="x")
    private int x;

    @Column(name="y")
    private int y;

    @Column(name="z")
    private int z;

    @Column(name= "modifieDateXYZ")
    @Temporal(TemporalType.DATE)
    private Date modifieDateXYZ;


    @PrePersist
    public void prePersist() {
        modifieDateXYZ = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
