package pe.edu.upc.aaw.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend.entities.Comentarios;

import java.util.List;

@Repository
public interface IComentariosRepository extends JpaRepository<Comentarios,Integer> {

    @Query(value = "Select u.username, count(*)\n" +
            "From comentarios\n" +
            "Inner join users u\n" +
            "on u.id = comentarios.id_usuario\n" +
            "Group by u.username ",nativeQuery = true)
    public List<String[]> ComentarioMayor5();

}
