package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TecnicaMeditacionDTO;
import pe.edu.upc.tfcreo.entities.TecnicaMeditacion;
import pe.edu.upc.tfcreo.servicesinterface.ITecnicaMeditacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tecnicameditacion")
public class TecnicaMeditacionController {

    @Autowired
    private ITecnicaMeditacionService tecnicamS;

    //inserta
    @PostMapping("/insertartecnicameditacion")
    public void insertarTecnicaMeditacion(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecnicamS.insertarTecnicaMeditacion(tecnicaMeditacion);
    }

    //modificar
    @GetMapping("/modificartecnicameditacion")
    public void modificarTecnicaMeditacion(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecnicamS.updateTecnicaMeditacion(tecnicaMeditacion);
    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminarTecnicaMeditacion(@PathVariable("id") int id) {this.tecnicamS.eliminarTecnicaMeditacion(id);}

    //listar
    @GetMapping("/listartecnicameditacion")
    public List<TecnicaMeditacionDTO> listarTecnicaMeditacion() {
        return tecnicamS.listarTecnicaMeditacion().stream().map(x-> {
            ModelMapper m=new ModelMapper();
            return m.map(x,TecnicaMeditacionDTO.class);
        }).collect(Collectors.toList());
    }



}
