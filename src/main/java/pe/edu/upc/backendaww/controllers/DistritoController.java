package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Distrito;
import pe.edu.upc.backendaww.servicesinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;
import java.text.ParseException;


@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private IDistritoService dService;

    @PostMapping
    public void registrar(@RequestBody Distrito d){
        dService.insertar(d);
    }

    @GetMapping
    public List<Distrito> listar(){
        return dService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Distrito distrito){
        dService.insertar(distrito);
    }

    @PostMapping("/buscar")
    public List<Distrito> buscar(@RequestBody Distrito d) throws ParseException{

        List<Distrito> listaDistritos;
        listaDistritos =dService.buscarDistrito(d.getNombreDistrito());
        if(listaDistritos.isEmpty()) {

        listaDistritos = dService.buscarCiudad(d.getCiudad().getNombreCiudad());
        }
        return listaDistritos;
    }

    @GetMapping("/{id}")
    public Optional<Distrito> listarId(@PathVariable("id") Integer id) {
        return dService.listarId(id);
    }
}
