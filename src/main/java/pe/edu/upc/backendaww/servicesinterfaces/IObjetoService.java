package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Objeto;

import java.util.List;
import java.util.Optional;
import java.util.Date;

public interface IObjetoService {

    public boolean insertar(Objeto objeto);
    List<Objeto> listar();
    public void eliminar(int idObjeto);

    public Optional<Objeto> listarId(int idObjeto);

    List<Objeto> buscarCuenta(String nombreCuenta);

    List<Objeto> buscarRecordatorio(String estadoRecordatorio);

    List<Objeto> buscarCategoriaObjeto(String nombreCategoriaObjeto);

    List<Objeto> buscarEstadoObjeto(String nombreEstadoObjeto);

    List<Objeto> buscarObjeto(String nombreObjeto);
}
