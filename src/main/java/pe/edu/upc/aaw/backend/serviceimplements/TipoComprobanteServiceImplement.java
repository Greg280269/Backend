package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.TipoComprobante;
import pe.edu.upc.aaw.backend.repositories.ITipoComprobanteRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.ITipoComprobanteService;

import java.util.List;
@Service
public class TipoComprobanteServiceImplement implements ITipoComprobanteService {

    @Autowired
    private ITipoComprobanteRepository tcR;

    @Override
    public void insertar(TipoComprobante s) {
        tcR.save(s);
    }

    @Override
    public List<TipoComprobante> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int id) { tcR.deleteById(id);}

    @Override
    public TipoComprobante listID(int id) {
        return tcR.findById(id).orElse(new TipoComprobante());
    }
}
