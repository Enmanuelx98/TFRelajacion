package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.PorcentajeDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresomusicaSDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresovideosTRDTO;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresomusicaSInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ProgresomusicaS")
public class ProgresomusicaSController {
    @Autowired
    private ProgresomusicaSInterface progresomusicaSInterface;
    //insertar
    @PostMapping
    public void insertar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.insertarProgresoMusica(progresomusicaS);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.updateProgresoMusica(progresomusicaS);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        progresomusicaSInterface.eliminarProgresoMusica(id);
    }

    //listar
    @GetMapping
    public List<ProgresomusicaSDTO> List() {
        return progresomusicaSInterface.listarProgresoMusica().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresomusicaSDTO.class);
        }).collect(Collectors.toList());
    }

   
}
