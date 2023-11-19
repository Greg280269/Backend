package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.TipoComprobante;

import java.util.List;

public interface ITipoComprobanteService {

    public void insertar(TipoComprobante s);
    public void delete(int id);
    List<TipoComprobante> list();
    public TipoComprobante listID(int id);

}
