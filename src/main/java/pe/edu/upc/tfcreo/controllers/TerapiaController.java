package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TerapiaDTO;
import pe.edu.upc.tfcreo.entities.Terapia;
import pe.edu.upc.tfcreo.servicesinterface.ITerapiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Terapias")
public class TerapiaController {

    @Autowired
    private ITerapiaService terapiaS;

    //insertar
    @PostMapping("/insertarterapia")
    public void insertarTerapia(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaS.insertarTerapia(terapia);
    }

    //modificar
    @PutMapping("/modificarterapia")
    public void modificarTerapia(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaS.updateTerapia(terapia);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarTerapia(@PathVariable("id") int id) {terapiaS.eliminarTerapia(id);}

    //listar
    @GetMapping("/listarterapia")
    public List<TerapiaDTO> listarTerapia() {
        return terapiaS.listarTerapia().stream().map(x-> {
            ModelMapper m=new ModelMapper();
            return m.map(x,TerapiaDTO.class);
        }).collect(Collectors.toList());
    }


}
