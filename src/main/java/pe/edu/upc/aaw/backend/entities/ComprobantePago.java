package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ComprobantePago")
public class ComprobantePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Eventos idEvento;
    @ManyToOne
    @JoinColumn(name = "idTipoComprobante")
    private TipoComprobante idTipoComprobante;
    @Column(name ="metodo", length = 50, nullable = false )
    private String metodo;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name ="ruc", length = 10, nullable = false )
    private String ruc;
    @Column(name = "igv")
    private int igv;
    @Column(name = "monto",scale = 2)
    private double monto;

    public ComprobantePago() {
    }

    public ComprobantePago(int id, Eventos idEvento, TipoComprobante idTipoComprobante, String metodo, LocalDate fecha, String ruc, int igv, double monto) {
        this.id = id;
        this.idEvento = idEvento;
        this.idTipoComprobante = idTipoComprobante;
        this.metodo = metodo;
        this.fecha = fecha;
        this.ruc = ruc;
        this.igv = igv;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Eventos getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Eventos idEvento) {
        this.idEvento = idEvento;
    }

    public TipoComprobante getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(TipoComprobante idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
