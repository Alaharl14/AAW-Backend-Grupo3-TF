package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.EstadoObjeto;
import pe.edu.upc.backendaww.servicesinterfaces.IEstadoObjetoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estadoobjeto")

public class EstadoObjetoController {
    @Autowired
    private IEstadoObjetoService eoService;

    @PostMapping
    public void registrar(@RequestBody EstadoObjeto eo){
        eoService.insertar(eo);
    }

    @GetMapping
    public List<EstadoObjeto>listar(){
        return eoService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eoService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody EstadoObjeto estadoObjeto){
        eoService.insertar(estadoObjeto);
    }

    @PostMapping("/buscar")
    public List<EstadoObjeto> buscar(@RequestBody EstadoObjeto estadoObjeto){
        List<EstadoObjeto> lista;
        estadoObjeto.setNombreEstadoObjeto(estadoObjeto.getNombreEstadoObjeto());
        lista=eoService.buscarEstadoObjeto(estadoObjeto.getNombreEstadoObjeto());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<EstadoObjeto> listarId(@PathVariable("id") Integer id) {
        return eoService.listarId(id);
    }
}