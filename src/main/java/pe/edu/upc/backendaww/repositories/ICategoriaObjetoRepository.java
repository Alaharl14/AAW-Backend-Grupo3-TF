package pe.edu.upc.backendaww.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.CategoriaObjeto;

import java.util.List;

@Repository
public interface ICategoriaObjetoRepository extends JpaRepository<CategoriaObjeto,Integer> {

    @Query("from CategoriaObjeto co where co.nombreCategoriaObjeto like %:nombreCategoriaObjeto%")
    List<CategoriaObjeto> buscarCategoriaObjeto(@Param("nombreCategoriaObjeto") String nombreCategoriaObjeto);
}
