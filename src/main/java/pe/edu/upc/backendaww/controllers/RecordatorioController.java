package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Recordatorio;
import pe.edu.upc.backendaww.servicesinterfaces.IRecordatorioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recordatorio")
public class RecordatorioController {
    @Autowired
    private IRecordatorioService rtService;
    @PostMapping
    public void registrar(@RequestBody Recordatorio rt){rtService.insertar(rt);}
    @GetMapping
    public List<Recordatorio> list(){return rtService.listar();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){rtService.eliminar(id);}
    @PutMapping
    public void modificar(@RequestBody Recordatorio recordatorio){
        rtService.insertar(recordatorio);
    }

    @GetMapping("/{id}")
    public Optional<Recordatorio> listarId(@PathVariable("id") Integer id) {
        return rtService.listarId(id);
    }
}