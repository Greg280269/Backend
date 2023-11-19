package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.EventosDTO;
import pe.edu.upc.aaw.backend.entities.Eventos;
import pe.edu.upc.aaw.backend.serviceinterfaces.IEventosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventosController {

    @Autowired
    private IEventosService ieS;
    @PostMapping
    public void registrar(@RequestBody EventosDTO dto){
        ModelMapper m= new ModelMapper();
        Eventos o = m.map(dto, Eventos.class);
        ieS.insertar(o);
    }

    @GetMapping
    public List<EventosDTO> listar(){
        return ieS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,EventosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ieS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody EventosDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Eventos o = m.map(dto,Eventos.class);
        ieS.insertar(o);
    }

    @GetMapping("/{id}")
    public EventosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        EventosDTO dto=m.map(ieS.listID(id),EventosDTO.class);
        return dto;
    }

}
