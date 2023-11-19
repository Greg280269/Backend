package pe.edu.upc.aaw.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private List<Roles> idRol;
    @Column(name = "dni", length = 8, nullable = false)
    private long dni;
    @Column(name = "username",length = 30, unique = true)
    private String username;
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "telefono", length = 9, nullable = false)
    private long telefono;
    @Column(name="enabled",nullable=false)
    private boolean enabled;
    @Column(length = 200)
    private String password;

    public Users() {
    }

    public Users(int id, List<Roles> idRol, long dni, String username, String apellido, String email, long telefono, boolean enabled, String password) {
        this.id = id;
        this.idRol = idRol;
        this.dni = dni;
        this.username = username;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.enabled = enabled;
        this.password = password;
    }

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
