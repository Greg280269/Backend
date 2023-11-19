package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.UsersDTO;
import pe.edu.upc.aaw.backend.entities.Users;
import pe.edu.upc.aaw.backend.serviceinterfaces.IUsersService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService uS;

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto){
        ModelMapper m= new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insertar(u);
    }

    @GetMapping
    public List<UsersDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        uS.delete(id);
    }


    @GetMapping("/{id}")
    public UsersDTO listarID(@PathVariable ("id") Integer id)
    {
        ModelMapper m= new ModelMapper();
        UsersDTO dto = m.map(uS.listID(id),UsersDTO.class);
        return dto;
    }

    @PutMapping
    public void Modificar (@RequestBody UsersDTO dto){
        ModelMapper m= new ModelMapper();
        Users u = m.map(dto,Users.class);
        uS.insertar(u);
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
}
