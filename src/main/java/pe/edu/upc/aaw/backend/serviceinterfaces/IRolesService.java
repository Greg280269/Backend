package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Roles;

import java.util.List;

public interface IRolesService {

    public void insertar(Roles s);
    public void delete(int idRole);
    List<Roles> list();
    public Roles listId(int id);


}
