package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.ComprobantePago;

@Repository
public interface IComprobantePagoRepository extends JpaRepository<ComprobantePago,Integer> {
}
