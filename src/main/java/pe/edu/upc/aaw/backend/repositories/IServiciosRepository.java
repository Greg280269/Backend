package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.Servicios;

import java.util.List;

@Repository
public interface IServiciosRepository extends JpaRepository<Servicios,Integer> {
    @Query(value = "select nombre, costo from servicios\n" +
            "where estado is true",nativeQuery = true)
    public List<String[]> cantidadDeServicio();
}
