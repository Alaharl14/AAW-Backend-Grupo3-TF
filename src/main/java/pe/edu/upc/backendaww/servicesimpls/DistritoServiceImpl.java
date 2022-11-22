package pe.edu.upc.backendaww.servicesimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.backendaww.entities.Distrito;
import pe.edu.upc.backendaww.repositories.IDistritoRepository;
import pe.edu.upc.backendaww.servicesinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;

@RestController
public class DistritoServiceImpl implements IDistritoService {
    @Autowired
    private IDistritoRepository dR;

    @Override
    @Transactional
    public boolean insertar(Distrito distrito) {
        Distrito objDistrito = dR.save(distrito);
        if (objDistrito == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Distrito> listar() {
        return dR.findAll();
    }

    @Override
    @Transactional
    public void eliminar(int idDistrito) {
        dR.deleteById(idDistrito);
    }

    @Override
    public Optional<Distrito> listarId(int idDistrito) {
        return dR.findById(idDistrito);
    }

    @Override
    public List<Distrito> buscarCiudad(String nombreCiudad) {
        return dR.buscarCiudad(nombreCiudad);
    }

    @Override
    public List<Distrito> buscarDistrito(String nombreDistrito) {
        return dR.buscarDistrito(nombreDistrito);
    }

}