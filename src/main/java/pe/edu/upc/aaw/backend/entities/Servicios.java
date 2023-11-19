package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="Servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 250, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;
    @Column(name = "costo", nullable = false, scale = 2)
    private double costo;
    @Column(name = "estado", length = 50, nullable = false)
    private boolean estado;

    public Servicios() {
    }

    public Servicios(int id, String nombre, String descripcion, double costo, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
