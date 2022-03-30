package com.backend.api.model;

import com.backend.api.entity.Inventarios;

import java.util.Date;

public class MInventarios {
    private Long id;
    private String producto;
    private String productoBase;
    private String modelo;
    private int listPrice;
    private Date modifieDate;

    public MInventarios(){
        }


        public MInventarios(Long id, String producto, String productoBase, String modelo,
                            int listPrice, Date modifieDate){
        super();
        this.id = id;
        this.producto = producto;
        this.productoBase = productoBase;
        this.modelo = modelo;
        this.listPrice = listPrice;
        this.modifieDate = modifieDate;
        }

        public  MInventarios(Inventarios inventarios){
            this.id = id;
            this.producto = producto;
            this.productoBase = productoBase;
            this.modelo = modelo;
            this.listPrice = listPrice;
            this.modifieDate = modifieDate;
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

    public Date getModifieDate() {
        return modifieDate;
    }

    public void setModifieDate(Date modifieDate) {
        this.modifieDate = modifieDate;
    }
}
