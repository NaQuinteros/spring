package com.sarasa.springhibernatetest;

import javax.persistence.*;

@Entity
public class Pais {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pais")
    private int id;

    @Column(name = "nombre_pais")
    private String nombre;

    @Column(name = "poblacion_actual")
    private String poblacionActual;

    public Pais() {

    }

    @Override
    public String toString() {
        return "id: "+this.id + " nombre:" +
                this.nombre + " Poblacion Actual:" +
                this.poblacionActual + ".";
    }

    public String getPoblacionActual() {
        return poblacionActual;
    }

    public void setPoblacionActual(String poblacionActual) {
        this.poblacionActual = poblacionActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
