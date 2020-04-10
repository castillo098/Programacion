package Modelo;

public class Producto {

    String cod_producto, precios, tipo_producto, mate_producto, nom_producto, stock;

    public Producto() {
    }

    public Producto(String cod_producto, String precios, String tipo_producto, String mate_producto, String nom_producto, String stock) {
        this.cod_producto = cod_producto;
        this.precios = precios;
        this.tipo_producto = tipo_producto;
        this.mate_producto = mate_producto;
        this.nom_producto = nom_producto;
        this.stock = stock;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getMate_producto() {
        return mate_producto;
    }

    public void setMate_producto(String mate_producto) {
        this.mate_producto = mate_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

}
