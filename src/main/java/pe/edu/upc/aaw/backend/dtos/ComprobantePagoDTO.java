package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Eventos;
import pe.edu.upc.aaw.backend.entities.TipoComprobante;

import java.time.LocalDate;

public class ComprobantePagoDTO {

    private int id;
    private Eventos idEvento;
    private TipoComprobante idTipoComprobante;
    private String metodo;
    private LocalDate fecha;
    private String ruc;
    private int igv;
    private double monto;

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
