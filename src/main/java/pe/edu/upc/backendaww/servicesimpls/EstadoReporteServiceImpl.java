package pe.edu.upc.backendaww.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendaww.entities.EstadoReporte;
import pe.edu.upc.backendaww.entities.Objeto;
import pe.edu.upc.backendaww.repositories.IEstadoReporteRepository;
import pe.edu.upc.backendaww.repositories.IObjetoRepository;
import pe.edu.upc.backendaww.servicesinterfaces.IEstadoReporteService;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoReporteServiceImpl implements IEstadoReporteService {

    @Autowired
    private IEstadoReporteRepository erR;
    @Override
    public void insertar(EstadoReporte estadoReporte) {
        erR.save(estadoReporte);
    }

    @Override
    public List<EstadoReporte> listar() {
        return erR.findAll();
    }

    @Override
    public void eliminar(int idEstadoReporte) {
        erR.deleteById(idEstadoReporte);
    }

    @Override
    public Optional<EstadoReporte> listarId(int idEstadoReporte) {
        return erR.findById(idEstadoReporte);
    }
    @Override
    public List<EstadoReporte> buscarEstadoReporte(String nombreEstadoReporte) {
        return erR.buscarEstadoReporte(nombreEstadoReporte);
    }
}
