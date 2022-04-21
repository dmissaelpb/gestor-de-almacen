package com.backend.api.model;
import com.backend.api.entity.TiposDeMateriales;
import java.util.Date;

public class MTiposDeMateriales {
    private Long id;
    private String nombreProducto;
    private int cantidad;
    private boolean reactividadQuimica;



    public MTiposDeMateriales() {
    }
    public  MTiposDeMateriales(Long id, String nombreProducto, int cantidad, boolean reactividadQuimica){
        super();
        this.id =id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.reactividadQuimica = reactividadQuimica;
    }

    public  MTiposDeMateriales(TiposDeMateriales tiposDeMateriales){
        this.id =id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.reactividadQuimica = reactividadQuimica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isReactividadQuimica() {
        return reactividadQuimica;
    }

    public void setReactividadQuimica(boolean reactividadQuimica) {
        this.reactividadQuimica = reactividadQuimica;
    }
}