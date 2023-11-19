package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Comentarios;

import java.util.List;

public interface IComentariosService {

    public void insertar(Comentarios s);
    List<Comentarios> list();
    public void delete (int id);
    public Comentarios listID (int id);
    public List<String[]>ComentarioMayor5();

}
