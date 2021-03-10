package com.example.bottom;

public class Profesor {
    private String nombre;
    private String foto;
    private String asignatura;

    public Profesor(String nombre, String foto, String asignatura) {
        this.nombre = nombre;
        this.foto = foto;
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", foto='" + foto + '\'' +
                ", asignatura='" + asignatura + '\'' +
                '}';
    }
}
