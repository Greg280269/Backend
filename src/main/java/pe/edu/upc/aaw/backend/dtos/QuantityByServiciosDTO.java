package pe.edu.upc.aaw.backend.dtos;

public class QuantityByServiciosDTO {

    private String nameServiceDisp;

    private double quanttiyByServiceDisp;


    public double getQuanttiyByServiceDisp() {
        return quanttiyByServiceDisp;
    }

    public void setQuanttiyByServiceDisp(double quanttiyByServiceDisp) {
        this.quanttiyByServiceDisp = quanttiyByServiceDisp;
    }

    public String getNameServiceDisp() {
        return nameServiceDisp;
    }

    public void setNameServiceDisp(String nameServiceDisp) {
        this.nameServiceDisp = nameServiceDisp;
    }
}
