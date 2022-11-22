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

    @Query(value = "select cu.nombre_cuenta, count(obj.id_objeto) as cantidad from cuenta cu inner join objeto obj on cu.id_cuenta = obj.id_cuenta group by cu.nombre_cuenta having count(obj.id_objeto)>3",nativeQuery = true)
    List<String[]>reporteMasCuentaObjetos();
}
