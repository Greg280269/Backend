package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Servicios;
import pe.edu.upc.aaw.backend.entities.Users;

public class LocalesDTO {

    private int id;
    private Users idUsuario;
    private Servicios idServicios;
    private String nombre;
    private String direccion;
    private int capacidad;

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

    public Servicios getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Servicios idServicios) {
        this.idServicios = idServicios;
    }
}
