package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.Servicios;
import pe.edu.upc.aaw.backend.repositories.IServiciosRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IServiciosService;

import java.util.List;
@Service
public class ServiciosServiceImplement implements IServiciosService {
    @Autowired
    private IServiciosRepository sdR;

    @Override
    public void insertar(Servicios s) {
        sdR.save(s);
    }

    @Override
    public List<Servicios> list() {
        return sdR.findAll();
    }

    @Override
    public void delete(int id) {
        sdR.deleteById(id);
    }

    @Override
    public Servicios listID(int id) {
        return sdR.findById(id).orElse(new Servicios());
    }

    @Override
    public List<String[]> cantidadDeServicio() {
        return sdR.cantidadDeServicio();
    }
}
