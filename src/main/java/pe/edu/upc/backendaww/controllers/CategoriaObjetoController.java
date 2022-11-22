package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.CategoriaObjeto;
import pe.edu.upc.backendaww.servicesinterfaces.ICategoriaObjetoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoriaobjeto")
public class CategoriaObjetoController {
    @Autowired
    private ICategoriaObjetoService coService;
    @PostMapping
    public void registrar(@RequestBody CategoriaObjeto co){coService.insertar(co);}
    @GetMapping
    public List<CategoriaObjeto>list(){return coService.listar();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        coService.eliminar(id);
    }
    @PutMapping
    public void modificar(@RequestBody CategoriaObjeto categoriaObjeto){
        coService.insertar(categoriaObjeto);
    }
    @PostMapping("/buscar")
    public List<CategoriaObjeto> buscar(@RequestBody CategoriaObjeto categoriaObjeto){
        List<CategoriaObjeto> listaCategoriaObjeto;
        listaCategoriaObjeto=coService.buscarCategoriaObjeto(categoriaObjeto.getNombreCategoriaObjeto());
        return listaCategoriaObjeto;
    }

    @GetMapping("/{id}")
    public Optional<CategoriaObjeto> listarId(@PathVariable("id") Integer id) {
        return coService.listarId(id);
    }
}