package pe.edu.upc.backendaww.servicesimpls;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.backendaww.entities.Recordatorio;
import pe.edu.upc.backendaww.repositories.IRecordatorioRepository;
import pe.edu.upc.backendaww.servicesinterfaces.IRecordatorioService;

import java.util.List;
import java.util.Optional;
@Service
public class RecordatorioServiceImpl implements IRecordatorioService {
    @Autowired
    private IRecordatorioRepository rtR;
    @Override
    public void insertar(Recordatorio recordatorio) {
        rtR.save(recordatorio);
    }

    @Override
    public List<Recordatorio> listar() {
        return rtR.findAll();
    }

    @Override
    public void eliminar(int idRecordatorio) {
        rtR.deleteById(idRecordatorio);
    }

    @Override
    public Optional<Recordatorio> listarId(int idRecordatorio) {
        return rtR.findById(idRecordatorio);
    }

}
