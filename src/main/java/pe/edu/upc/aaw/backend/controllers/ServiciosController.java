package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.QuantityByServiciosDTO;
import pe.edu.upc.aaw.backend.dtos.ServiciosDTO;
import pe.edu.upc.aaw.backend.entities.Servicios;
import pe.edu.upc.aaw.backend.serviceinterfaces.IServiciosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {

    @Autowired
    private IServiciosService sdS;

    @PostMapping
    public void registrar (@RequestBody ServiciosDTO dto){
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto, Servicios.class);
        sdS.insertar(n);
    }

    @GetMapping
    public List<ServiciosDTO> listar(){
        return sdS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ServiciosDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sdS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ServiciosDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto, Servicios.class);
        sdS.insertar(n);
    }

    @GetMapping("/{id}")
    public ServiciosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ServiciosDTO dto=m.map(sdS.listID(id),ServiciosDTO.class);
        return dto;
    }

    @GetMapping("/cantidadServicios")
    public List<QuantityByServiciosDTO> CantidadDeServicio(){
        List<String[]> pslista= sdS.cantidadDeServicio();
        List<QuantityByServiciosDTO>psListDTO = new ArrayList<>();
        for (String[] data: pslista){
            QuantityByServiciosDTO psdto= new QuantityByServiciosDTO();
            psdto.setQuanttiyByService(Integer.parseInt(data[0]));
            psListDTO.add(psdto);
        }
        return psListDTO;
    }

}
