package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Cuenta;
import pe.edu.upc.backendaww.entities.Respuesta;
import pe.edu.upc.backendaww.servicesinterfaces.ICuentaService;

import java.util.List;
import java.util.Optional;
import java.text.ParseException;


@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @Autowired
    private ICuentaService cService;

    @PostMapping
    public void registrar(@RequestBody Cuenta c){
        cService.insertar(c);
    }

    @GetMapping
    public List<Cuenta> listar(){
        return cService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Cuenta cuenta){
        cService.insertar(cuenta);
    }

    @PostMapping("/buscar")
    public List<Cuenta> buscar(@RequestBody Cuenta c) throws ParseException{
        List<Cuenta> listaCuentas;
        listaCuentas =cService.buscarCuenta(c.getNombreCuenta());
        if(listaCuentas.isEmpty()) {

            listaCuentas = cService.buscarDistrito(c.getDistrito().getNombreDistrito());
        }
        return listaCuentas;
    }

    @GetMapping("/{id}")
    public Optional<Cuenta> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }

    @GetMapping("/reportes")
    public List<Respuesta> reporteMas(){
        return cService.reporteMasObjetos();

    }
}
