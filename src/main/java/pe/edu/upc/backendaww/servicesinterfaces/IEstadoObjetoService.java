package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.EstadoObjeto;

import java.util.List;
import java.util.Optional;

public interface IEstadoObjetoService {

    public void insertar(EstadoObjeto estadoobjeto);
    List<EstadoObjeto>listar();

    public void eliminar(int idEstadoObjeto);

    public Optional<EstadoObjeto> listarId(int idEstadoObjeto);

    List<EstadoObjeto> buscarEstadoObjeto(String nombreEstadoObjeto);
}

