package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoComprobante")
public class TipoComprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 250, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;

    public TipoComprobante() {
    }

    public TipoComprobante(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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
}
