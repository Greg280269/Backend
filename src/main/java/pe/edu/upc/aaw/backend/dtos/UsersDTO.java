package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Roles;

import java.util.List;

public class UsersDTO {

    private int id;
    private List<Roles> idRol;
    private long dni;
    private String username;
    private String apellido;
    private String email;
    private long telefono;
    private boolean enabled;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Roles> getIdRol() {
        return idRol;
    }

    public void setIdRol(List<Roles> idRol) {
        this.idRol = idRol;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
