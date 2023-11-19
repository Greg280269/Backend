package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.LocalesDTO;
import pe.edu.upc.aaw.backend.entities.Locales;
import pe.edu.upc.aaw.backend.serviceinterfaces.ILocalesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locales")
public class LocalesController {

    @Autowired
    private ILocalesService ilS;
    @PostMapping
    public void registrar(@RequestBody LocalesDTO dto){
        ModelMapper m= new ModelMapper();
        Locales o = m.map(dto, Locales.class);
        ilS.insertar(o);
    }

    @GetMapping
    public List<LocalesDTO> listar(){
        return ilS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,LocalesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ilS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody LocalesDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Locales o = m.map(dto,Locales.class);
        ilS.insertar(o);
    }

    @GetMapping("/{id}")
    public LocalesDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        LocalesDTO dto=m.map(ilS.listID(id),LocalesDTO.class);
        return dto;
    }

}
