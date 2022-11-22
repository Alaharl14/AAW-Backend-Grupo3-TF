package pe.edu.upc.backendaww.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendaww.entities.CategoriaObjeto;
import pe.edu.upc.backendaww.repositories.ICategoriaObjetoRepository;
import pe.edu.upc.backendaww.servicesinterfaces.ICategoriaObjetoService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaObjetoServiceImpl implements ICategoriaObjetoService {

    @Autowired
    private ICategoriaObjetoRepository coR;
    @Override
    public void insertar(CategoriaObjeto categoriaobjeto) {
        coR.save(categoriaobjeto);
    }

    @Override
    public List<CategoriaObjeto> listar() {
        return coR.findAll();
    }

    @Override
    public void eliminar(int idCategoriaObjeto) {
        coR.deleteById(idCategoriaObjeto);
    }

    @Override
    public Optional<CategoriaObjeto> listarId(int idCategoriaObjeto) {
        return coR.findById(idCategoriaObjeto);
    }

    @Override
    public List<CategoriaObjeto> buscarCategoriaObjeto(String nombreCategoria) {
        return coR.buscarCategoriaObjeto(nombreCategoria);
    }
}