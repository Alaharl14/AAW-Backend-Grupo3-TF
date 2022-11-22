package pe.edu.upc.backendaww.servicesimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendaww.entities.EstadoObjeto;
import pe.edu.upc.backendaww.repositories.IEstadoObjetoRepository;
import pe.edu.upc.backendaww.servicesinterfaces.IEstadoObjetoService;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoObjetoServiceImpl implements IEstadoObjetoService {
    @Autowired
    private IEstadoObjetoRepository eoR;
    @Override
    public void insertar(EstadoObjeto estadoobjeto) {
        eoR.save(estadoobjeto);
    }

    @Override
    public List<EstadoObjeto> listar() {
        return eoR.findAll();
    }

    @Override
    public void eliminar(int idEstadoObjeto) {
        eoR.deleteById(idEstadoObjeto);
    }

    @Override
    public Optional<EstadoObjeto> listarId(int idEstadoObjeto) {
        return Optional.of(eoR.findById(idEstadoObjeto).orElse(new EstadoObjeto()));
    }

    @Override
    public List<EstadoObjeto> buscarEstadoObjeto(String nombreEstadoObjeto) {
        return eoR.buscarEstadoObjeto(nombreEstadoObjeto);
    }
}

