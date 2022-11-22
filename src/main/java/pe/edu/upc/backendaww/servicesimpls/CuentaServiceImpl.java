package pe.edu.upc.backendaww.servicesimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.backendaww.entities.Cuenta;
import pe.edu.upc.backendaww.entities.Distrito;
import pe.edu.upc.backendaww.entities.Respuesta;
import pe.edu.upc.backendaww.repositories.ICuentaRepository;
import pe.edu.upc.backendaww.repositories.IDistritoRepository;
import pe.edu.upc.backendaww.servicesinterfaces.ICuentaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CuentaServiceImpl implements ICuentaService {

    @Autowired
    private ICuentaRepository cR;

    @Override
    @Transactional
    public boolean insertar(Cuenta cuenta) {
        Cuenta objCuenta = cR.save(cuenta);
        if (objCuenta == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Cuenta> listar() {
        return cR.findAll();
    }

    @Override
    @Transactional
    public void eliminar(int idCuenta) {
        cR.deleteById(idCuenta);
    }

    @Override
    public Optional<Cuenta> listarId(int idCuenta) {
        return cR.findById(idCuenta);
    }

    @Override
    public List<Cuenta> buscarDistrito(String nombreDistrito) {
        return cR.buscarDistrito(nombreDistrito);
    }

    @Override
    public List<Cuenta> buscarCuenta(String nombreCuenta) { return cR.buscarCuenta(nombreCuenta); }

    @Override
    public List<Respuesta> reporteMasObjetos() {
        List<Respuesta>lista=new ArrayList<>();
        cR.reporteMasCuentaObjetos().forEach(y->{
            Respuesta r=new Respuesta();
            r.setNombre_cuenta(y[0]);
            r.setCantidad(y[1]);
            lista.add(r);
        });
        return lista;
    }

}
