package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.EstadoReporte;
import pe.edu.upc.backendaww.servicesinterfaces.IEstadoReporteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estadoreporte")
public class EstadoReporteController {

    @Autowired
    private IEstadoReporteService erService;

    @PostMapping
    public void registrar(@RequestBody EstadoReporte er){
        erService.insertar(er);
    }

    @GetMapping
    public List<EstadoReporte> listar(){
        return erService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        erService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody EstadoReporte estadoReporte){
        erService.insertar(estadoReporte);
    }

    @PostMapping("/buscar")
    public List<EstadoReporte> buscar(@RequestBody EstadoReporte estadoReporte){
        List<EstadoReporte> lista;
        estadoReporte.setNombreEstadoReporte(estadoReporte.getNombreEstadoReporte());
        lista=erService.buscarEstadoReporte(estadoReporte.getNombreEstadoReporte());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<EstadoReporte> listarId(@PathVariable("id") Integer id) {
        return erService.listarId(id);
    }
}
