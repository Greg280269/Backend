package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.TipoComprobante;

@Repository
public interface ITipoComprobanteRepository extends JpaRepository<TipoComprobante,Integer> {
}
