package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Cuenta;

import java.util.List;
import java.util.Optional;

public interface ICuentaService {

    public boolean insertar(Cuenta cuenta);
    List<Cuenta> listar();
    public void eliminar(int idCuenta);
    public Optional<Cuenta> listarId(int idCuenta);

    List<Cuenta> buscarDistrito(String nombreDistrito);

    List<Cuenta> buscarCuenta(String nombreCuenta);
}
