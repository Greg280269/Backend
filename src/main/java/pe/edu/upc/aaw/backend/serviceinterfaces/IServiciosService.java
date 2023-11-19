package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Servicios;

import java.util.List;

public interface IServiciosService {

    public void insertar(Servicios s);
    List<Servicios> list();
    public void delete(int id);
    public Servicios listID(int id);

    public List<String[]> cantidadDeServicio();

}
