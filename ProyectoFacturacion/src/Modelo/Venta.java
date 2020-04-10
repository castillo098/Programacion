package Modelo;

public class Venta {

    String id_producto, cod_producto, ced_comprador, nom_producto, estado_producto, tipo_producto, cantidad, precio;

    public Venta() {
    }

    public Venta(String id_producto, String cod_producto, String ced_comprador, String nom_producto, String estado_producto, String tipo_producto, String cantidad, String precio) {
        this.id_producto = id_producto;
        this.cod_producto = cod_producto;
        this.ced_comprador = ced_comprador;
        this.nom_producto = nom_producto;
        this.estado_producto = estado_producto;
        this.tipo_producto = tipo_producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getCed_comprador() {
        return ced_comprador;
    }

    public void setCed_comprador(String ced_comprador) {
        this.ced_comprador = ced_comprador;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
