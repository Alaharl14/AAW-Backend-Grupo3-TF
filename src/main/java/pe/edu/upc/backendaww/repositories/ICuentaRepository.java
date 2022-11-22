package pe.edu.upc.backendaww.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.Cuenta;

import java.util.List;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta,Integer> {

    @Query("from Cuenta c where c.distrito.nombreDistrito like %:nombreDistrito%")
    List<Cuenta> buscarDistrito(@Param("nombreDistrito") String nombreDistrito);

    @Query("from Cuenta c where c.nombreCuenta like %:nombreCuenta%")
    List<Cuenta> buscarCuenta(@Param("nombreCuenta") String nombreCuenta);
}
