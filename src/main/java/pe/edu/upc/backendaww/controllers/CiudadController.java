package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Ciudad;
import pe.edu.upc.backendaww.servicesinterfaces.ICiudadService;

import java.util.List;
import java.util.Optional;
import java.text.ParseException;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
    @Autowired
    private ICiudadService cService;

    @PostMapping
    public void registrar(@RequestBody Ciudad c){
        cService.insertar(c);
    }

    @GetMapping
    public List<Ciudad>listar(){
        return cService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Ciudad c){
        cService.insertar(c);
    }

    @PostMapping("/buscar")
    public List<Ciudad> buscar(@RequestBody Ciudad ciudad) throws ParseException{
        List<Ciudad> listaCiudades;
        listaCiudades=cService.buscarCiudad(ciudad.getNombreCiudad());
        return listaCiudades;
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }
}
