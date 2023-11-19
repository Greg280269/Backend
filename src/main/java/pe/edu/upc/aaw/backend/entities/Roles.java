package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Roles {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rol",length = 50, nullable = false)
    private String rol;
    @ManyToOne
    @JoinColumn(name="user_id")
    private Users idUsuario;

    public Roles() {
    }

    public Roles(Long id, String rol, Users idUsuario) {
        this.id = id;
        this.rol = rol;
        this.idUsuario = idUsuario;
    }

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
