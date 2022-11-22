package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.EstadoReporte;

import java.util.List;
import java.util.Optional;

public interface IEstadoReporteService {

    public void insertar(EstadoReporte estadoReporte);
    List<EstadoReporte> listar();
    public void eliminar(int idEstadoReporte);
    public Optional<EstadoReporte> listarId(int idEstadoReporte);
    List<EstadoReporte> buscarEstadoReporte(String nombreEstadoReporte);
}
