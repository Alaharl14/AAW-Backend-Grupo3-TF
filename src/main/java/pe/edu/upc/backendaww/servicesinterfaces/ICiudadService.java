package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Ciudad;

import java.util.List;
import java.util.Optional;

public interface ICiudadService {
    public void insertar(Ciudad ciudad);
    List<Ciudad>listar();
    public void eliminar(int idCiudad);

    public Optional<Ciudad> listarId(int idCiudad);

    List<Ciudad> buscarCiudad(String nombreCiudad);
}
