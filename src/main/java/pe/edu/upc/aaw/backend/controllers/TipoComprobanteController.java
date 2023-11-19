package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.TipoComprobanteDTO;
import pe.edu.upc.aaw.backend.entities.TipoComprobante;
import pe.edu.upc.aaw.backend.serviceinterfaces.ITipoComprobanteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoComprobante")
public class TipoComprobanteController {

    @Autowired
    private ITipoComprobanteService tdS;

    @PostMapping
    public void registrar(@RequestBody TipoComprobanteDTO dto){
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto,TipoComprobante.class);
        tdS.insertar(o);
    }

    @GetMapping
    public List<TipoComprobanteDTO> listar(){
        return tdS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,TipoComprobanteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tdS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody TipoComprobanteDTO dto) {
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto,TipoComprobante.class);
        tdS.insertar(o);
    }

    @GetMapping("/{id}")
    public TipoComprobanteDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TipoComprobanteDTO dto=m.map(tdS.listID(id),TipoComprobanteDTO.class);
        return dto;
    }

}
