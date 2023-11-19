package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Locales;

import java.util.List;

public interface ILocalesService {

    public void insertar(Locales s);
    List<Locales> list();
    public void delete(int id);
    public Locales listID(int id);

}
