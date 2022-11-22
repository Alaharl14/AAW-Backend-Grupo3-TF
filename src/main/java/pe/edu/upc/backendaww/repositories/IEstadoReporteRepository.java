package pe.edu.upc.backendaww.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.EstadoReporte;

import java.util.List;

@Repository
public interface IEstadoReporteRepository extends JpaRepository<EstadoReporte,Integer> {

    @Query("from EstadoReporte er where er.nombreEstadoReporte like %:nombreEstadoReporte%")
    List<EstadoReporte> buscarEstadoReporte(@Param("nombreEstadoReporte") String nombreEstadoReporte);
}
