package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Reporte;
import pe.edu.upc.backendaww.servicesinterfaces.IReporteService;

import java.util.List;
import java.util.Optional;
import java.text.ParseException;

@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    private IReporteService rService;

    @PostMapping
    public void registrar(@RequestBody Reporte r){
        rService.insertar(r);
    }

    @GetMapping
    public List<Reporte>listar(){
        return rService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Reporte reporte){
        rService.insertar(reporte);
    }

    @PostMapping("/buscar")
    public List<Reporte> buscar(@RequestBody Reporte r) throws ParseException{
        List<Reporte> listaReportes;
        listaReportes =rService.buscarReporte(r.getNombreReporte());
        if(listaReportes.isEmpty()) {

            listaReportes = rService.buscarObjeto(r.getObjeto().getNombreObjeto());
            if (listaReportes.isEmpty()){
                listaReportes = rService.buscarEstadoReporte(r.getEstadoreporte().getNombreEstadoReporte());
            }
        }
        return listaReportes;
    }

    @GetMapping("/{id}")
    public Optional<Reporte> listarId(@PathVariable("id") Integer id) {
        return rService.listarId(id);
    }

}