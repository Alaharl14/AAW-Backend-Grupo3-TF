package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Distrito;

import java.util.List;
import java.util.Optional;

public interface IDistritoService {


    public boolean insertar(Distrito distrito);
    List<Distrito> listar();
    public void eliminar(int idDistrito);

    public Optional<Distrito> listarId(int idDistrito);

    List<Distrito> buscarCiudad(String nombreCiudad);

    List<Distrito> buscarDistrito(String nombreDistrito);

}
