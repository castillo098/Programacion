package Modelo;

public class Cliente {

    String cedula, nombres, apellidos, telefono, barrio, Ncasa, direccion, correo;

    public Cliente() {
    }

    public Cliente(String cedula, String nombres, String apellidos, String telefono, String barrio, String Ncasa, String direccion, String correo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.barrio = barrio;
        this.Ncasa = Ncasa;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTeléfono(String telefono) {
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getNcasa() {
        return Ncasa;
    }

    public void setNcasa(String Ncasa) {
        this.Ncasa = Ncasa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
