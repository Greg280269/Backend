package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.ComentariosDTO;
import pe.edu.upc.aaw.backend.entities.Comentarios;
import pe.edu.upc.aaw.backend.serviceinterfaces.IComentariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

    @Autowired
    private IComentariosService icS;

    @PostMapping
    public void registrar(@RequestBody ComentariosDTO dto){
        ModelMapper m= new ModelMapper();
        Comentarios o = m.map(dto, Comentarios.class);
        icS.insertar(o);
    }

    @GetMapping
    public List<ComentariosDTO> listar(){
        return icS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,ComentariosDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){icS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody ComentariosDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Comentarios o = m.map(dto,Comentarios.class);
        icS.insertar(o);
    }

    @GetMapping("/{id}")
    public ComentariosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ComentariosDTO dto=m.map(icS.listID(id),ComentariosDTO.class);
        return dto;
    }

    @GetMapping("/cantidadComentariosByUser")
    public List<ComentariosMayor5DTO> CantidadDeServicio(){
        List<String[]> pslista= icS.ComentarioMayor5();
        List<ComentariosMayor5DTO>psListDTO = new ArrayList<>();
        for (String[] data: pslista){
            ComentariosMayor5DTO psdto= new ComentariosMayor5DTO();
            psdto.setUsernameCom(data[0]);
            psdto.setContador(Integer.parseInt(data[1]));
            psListDTO.add(psdto);
        }
        return psListDTO;
    }

}
