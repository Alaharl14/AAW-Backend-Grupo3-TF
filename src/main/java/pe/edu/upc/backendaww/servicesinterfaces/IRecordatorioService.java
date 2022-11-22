package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Recordatorio;

import java.util.List;
import java.util.Optional;

public interface IRecordatorioService {
    public void insertar(Recordatorio recordatorio);
    List<Recordatorio> listar();
    public void eliminar (int idRecordatorio);
    public Optional<Recordatorio> listarId(int idRecordatorio);
}
