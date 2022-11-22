package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Reporte;

import java.util.List;
import java.util.Optional;

public interface IReporteService {

    public boolean insertar(Reporte reporte);
    List<Reporte> listar();
    public void eliminar(int idReporte);

    public Optional<Reporte> listarId(int idReporte);

    List<Reporte> buscarObjeto(String nombreObjeto);

    List<Reporte> buscarEstadoReporte(String nombreEstadoObjeto);

    List<Reporte> buscarReporte(String nombreReporte);
}