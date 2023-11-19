package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.RolesDTO;
import pe.edu.upc.aaw.backend.entities.Roles;
import pe.edu.upc.aaw.backend.serviceinterfaces.IRolesService;
import pe.edu.upc.aaw.backend.serviceinterfaces.IUsersService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private IRolesService irS;
    @Autowired
    private IUsersService iuS;

    @PostMapping
    public void insert(@RequestBody RolesDTO dto) {
        ModelMapper m = new ModelMapper();
        Roles b = m.map(dto, Roles.class);
        irS.insertar(b);
    }
    @GetMapping
    public List<RolesDTO> list() {
        return irS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")int id){
        irS.delete(id);
    }

    @GetMapping("/{id}")
    public RolesDTO listId(@PathVariable("id")int id){
        ModelMapper m=new ModelMapper();
        RolesDTO dto=m.map(irS.listId(id),RolesDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody RolesDTO dto){
        ModelMapper m=new ModelMapper();
        Roles a=m.map(dto,Roles.class);
        irS.insertar(a);
    }
}
