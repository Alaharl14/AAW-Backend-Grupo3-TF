package pe.edu.upc.backendaww.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.Recordatorio;

import java.util.List;
@Repository
public interface IRecordatorioRepository extends JpaRepository<Recordatorio,Integer> {

}