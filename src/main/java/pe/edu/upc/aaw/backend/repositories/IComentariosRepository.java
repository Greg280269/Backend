package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.Comentarios;

import java.util.List;

@Repository
public interface IComentariosRepository extends JpaRepository<Comentarios,Integer> {

    @Query(value = "Select count(id_comentario) from comentario where valoracion > 5",nativeQuery = true)
    public List<String[]> ComentarioMayor5();

}