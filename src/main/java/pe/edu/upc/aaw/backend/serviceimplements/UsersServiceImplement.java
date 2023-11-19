package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.Users;
import pe.edu.upc.aaw.backend.repositories.IUsersRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IUsersService;

import java.util.List;
@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private IUsersRepository uR;

    @Override
    public void insertar(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Users listID(int id) {
        return uR.findById(id).orElse(new Users());
    }
}
