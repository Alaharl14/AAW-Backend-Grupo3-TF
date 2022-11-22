package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Objeto;
import pe.edu.upc.backendaww.servicesinterfaces.IObjetoService;

import java.util.List;
import java.util.Optional;
import java.text.ParseException;


@RestController
@RequestMapping("/objeto")
public class ObjetoController {
    @Autowired
    private IObjetoService oService;

    @PostMapping
    public void registrar(@RequestBody Objeto o){
        oService.insertar(o);
    }

    @GetMapping
    public List<Objeto> listar(){
        return oService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Objeto objeto){
        oService.insertar(objeto);
    }

    @PostMapping("/buscar")
    public List<Objeto> buscar(@RequestBody Objeto o) throws ParseException{
        List<Objeto> listaObjetos;
        listaObjetos =oService.buscarObjeto(o.getNombreObjeto());

        if(listaObjetos.isEmpty()) {
            listaObjetos = oService.buscarCuenta(o.getCuenta().getNombreCuenta());
        }
        else if(listaObjetos.isEmpty()){
            listaObjetos = oService.buscarCategoriaObjeto(o.getCategoriaObjeto().getNombreCategoriaObjeto());
        }
        else if (listaObjetos.isEmpty()) {
                listaObjetos = oService.buscarEstadoObjeto(o.getEstadoObjeto().getNombreEstadoObjeto());
        }

        return listaObjetos;
    }

    @GetMapping("/{id}")
    public Optional<Objeto> listarId(@PathVariable("id") Integer id) {
        return oService.listarId(id);
    }
}
