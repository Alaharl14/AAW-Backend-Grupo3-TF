package pe.edu.upc.backendaww.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.Ciudad;

import java.util.List;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad,Integer> {

    @Query("from Ciudad c where c.nombreCiudad like %:nombreCiudad%")
    List<Ciudad> buscarCiudad(@Param("nombreCiudad") String nombreCiudad);

}
