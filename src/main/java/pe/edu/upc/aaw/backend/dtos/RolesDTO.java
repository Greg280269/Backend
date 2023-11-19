package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Users;

public class RolesDTO {

    private Long id;
    private String rol;
    private Users idUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Users idUsuario) {
        this.idUsuario = idUsuario;
    }

}
