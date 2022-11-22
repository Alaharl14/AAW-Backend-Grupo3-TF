package pe.edu.upc.backendaww.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendaww.entities.Ciudad;
import pe.edu.upc.backendaww.repositories.ICiudadRepository;
import pe.edu.upc.backendaww.servicesinterfaces.ICiudadService;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadServiceImpl implements ICiudadService {
    @Autowired
    private ICiudadRepository cR;
    @Override
    public void insertar(Ciudad ciudad) {
        cR.save(ciudad);
    }

    @Override
    public List<Ciudad> listar() {
        return cR.findAll();
    }

    @Override
    public void eliminar(int idCiudad) {
        cR.deleteById(idCiudad);
    }

    @Override
    public Optional<Ciudad> listarId(int idCiudad) {
        return cR.findById(idCiudad);
    }

    @Override
    public List<Ciudad> buscarCiudad(String nombreCiudad) {

        return cR.buscarCiudad(nombreCiudad);
    }
}

