package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.CategoriaObjeto;

import java.util.List;
import java.util.Optional;

public interface ICategoriaObjetoService {
    public void insertar(CategoriaObjeto categoriaobjeto);
    List<CategoriaObjeto>listar();
    public void eliminar(int idCategoriaObjeto);

    public Optional<CategoriaObjeto>listarId(int idCategoriaObjeto);

    List<CategoriaObjeto> buscarCategoriaObjeto(String nombreCategoriaObjeto);
}
