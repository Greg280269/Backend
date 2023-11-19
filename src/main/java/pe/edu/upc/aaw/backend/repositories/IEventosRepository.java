package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.Eventos;

@Repository
public interface IEventosRepository extends JpaRepository<Eventos,Integer> {
}
