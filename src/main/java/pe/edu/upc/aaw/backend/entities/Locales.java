package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="Locales")
public class Locales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Users idUsuario;
    @ManyToOne
    @JoinColumn(name = "idServicios")
    private Servicios idServicios;
    @Column(name ="nombre", length = 250, nullable = false )
    private String nombre;
    @Column(name ="direccion", length = 250, nullable = false )
    private String direccion;
    @Column(name ="capacidad", nullable = false )
    private int capacidad;

    public Locales() {
    }

    public Locales(int id, Users idUsuario, Servicios idServicios, String nombre, String direccion, int capacidad) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idServicios = idServicios;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Users idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Servicios getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Servicios idServicios) {
        this.idServicios = idServicios;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
