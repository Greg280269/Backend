package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentarios")
public class Comentarios {

    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Users idUsuario;
    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Eventos idEvento;
    @Column(name = "valoracion", nullable = false)
    private int valoracion;
    @Column(name = "contenido", length = 50, nullable = false)
    private String contenido;

    public Comentarios() {
    }

    public Comentarios(int id, Users idUsuario, Eventos idEvento, int valoracion, String contenido) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.valoracion = valoracion;
        this.contenido = contenido;
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

    public Eventos getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Eventos idEvento) {
        this.idEvento = idEvento;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
