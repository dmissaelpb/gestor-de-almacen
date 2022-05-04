package com.backend.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Inventarios implements Serializable  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="producto",length = 50)
    private String producto;

    @Column(name="productoBase",length = 50)
    private String productoBase;

    @Column(name="modelo",length = 50)
    private String modelo;

    @Column(name="listPrice")
    private int listPrice;

    @Column(name= "date")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProductoBase() {
        return productoBase;
    }

    public void setProductoBase(String productoBase) {
        this.productoBase = productoBase;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
