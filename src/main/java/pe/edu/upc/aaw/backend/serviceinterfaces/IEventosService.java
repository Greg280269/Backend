package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Eventos;

import java.util.List;

public interface IEventosService {

    public void insertar(Eventos s);
    List<Eventos> list();
    public void delete(int id);
    public Eventos listID(int id);

}
