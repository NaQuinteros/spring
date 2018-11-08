package com.sarasa.springhibernatetest;
import javax.persistence.*;

@Entity
public class Continente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cont")
    private int id;

    @Column(name = "nombre_cont")
    private String nombre;

    @Column(name = "poblacion_cont")
    private int poblacion;


    public Continente(){}

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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
