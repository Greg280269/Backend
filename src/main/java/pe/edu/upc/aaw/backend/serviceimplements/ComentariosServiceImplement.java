package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.Comentarios;
import pe.edu.upc.aaw.backend.repositories.IComentariosRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IComentariosService;

import java.util.List;
@Service
public class ComentariosServiceImplement implements IComentariosService {

    @Autowired
    private IComentariosRepository cR;

    @Override
    public void insertar(Comentarios s) {
        cR.save(s);
    }

    @Override
    public List<Comentarios> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Comentarios listID(int id) {
        return cR.findById(id).orElse(new Comentarios());
    }

    @Override
    public List<String[]> ComentarioMayor5() {
        return cR.ComentarioMayor5();
    }
}
