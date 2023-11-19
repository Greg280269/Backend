package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.Users;

import java.util.List;

public interface IUsersService {
    public void insertar(Users s);
    public List<Users> list();
    public void delete (int id);
    public Users listID(int id);
}
