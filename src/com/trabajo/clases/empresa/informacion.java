package com.trabajo.clases.empresa;

public class informacion {
    String nombre, direccion, rfc;

    public informacion() {
    }

    public informacion(String nombre, String direccion, String rfc, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rfc = rfc;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
