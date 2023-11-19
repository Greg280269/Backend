package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.ComprobantePagoDTO;
import pe.edu.upc.aaw.backend.entities.ComprobantePago;
import pe.edu.upc.aaw.backend.serviceinterfaces.IComprobantePagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantePago")
public class ComprobantePagoController {

    @Autowired
    private IComprobantePagoService dvS;


    @PostMapping
    public void registrar (@RequestBody ComprobantePagoDTO dto){
        ModelMapper m = new ModelMapper();
        ComprobantePago n = m.map(dto, ComprobantePago.class);
        dvS.insertar(n);
    }

    @GetMapping
    public List<ComprobantePagoDTO> listar(){
        return dvS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ComprobantePagoDTO.class);
        })).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dvS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody ComprobantePagoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        ComprobantePago n = m.map(dto,ComprobantePago.class);
        dvS.insertar(n);
    }


    @GetMapping("/{id}")
    public ComprobantePagoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ComprobantePagoDTO dto=m.map(dvS.listID(id),ComprobantePagoDTO.class);
        return dto;
    }
}
