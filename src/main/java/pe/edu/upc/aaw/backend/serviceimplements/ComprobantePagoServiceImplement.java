package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.Comentarios;

import pe.edu.upc.aaw.backend.entities.ComprobantePago;
import pe.edu.upc.aaw.backend.repositories.IComentariosRepository;
import pe.edu.upc.aaw.backend.repositories.IComprobantePagoRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IComprobantePagoService;

import java.util.List;
@Service
public class ComprobantePagoServiceImplement implements IComprobantePagoService {
    @Autowired
    private IComprobantePagoRepository cpR;

    @Override
    public void insertar(ComprobantePago s) {
        cpR.save(s);
    }

    @Override
    public List<ComprobantePago> list() {
        return cpR.findAll();
    }

    @Override
    public void delete(int id) {
        cpR.deleteById(id);
    }

    @Override
    public ComprobantePago listID(int id) {
        return cpR.findById(id).orElse(new ComprobantePago());
    }
}
