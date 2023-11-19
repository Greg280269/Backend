package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.Roles;
import pe.edu.upc.aaw.backend.repositories.IRolesRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IRolesService;

import java.util.List;
@Service
public class RolesServiceImplement implements IRolesService {
    @Autowired
    IRolesRepository rR;

    @Override
    public void insertar(Roles r) {
        rR.save(r);
    }

    @Override
    public void delete(int idRole) {
        rR.deleteById(idRole);
    }

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }

    @Override
    public Roles listId(int id) {
        return rR.findById(id).orElse(new Roles());
    }
}
