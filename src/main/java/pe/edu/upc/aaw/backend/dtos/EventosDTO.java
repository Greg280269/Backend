package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Locales;
import pe.edu.upc.aaw.backend.entities.Users;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventosDTO {

    private int id;
    private Locales idLocal;
    private Users idUsuario;
    private String nombre;
    private String descripcion;
    private LocalDate fecha;
    private int capacidad;
    private double costo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Locales getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Locales idLocal) {
        this.idLocal = idLocal;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
