package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.ProgresomusicaSDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresovideosTRDTO;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresovideosTRInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ProgresovideosTR")
public class ProgresovideosTRController {
    @Autowired
    private ProgresovideosTRInterface progresovideosTRInterface;
    //insertar
    @PostMapping
    public void insertar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.insertarProgresoVideosTR(progresovideosTR);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.updateProgresoVideosTR(progresovideosTR);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        progresovideosTRInterface.eliminarProgresoVideosTR(id);
    }

    //listar
    @GetMapping
    public List<ProgresovideosTRDTO> List() {
        return progresovideosTRInterface.listarProgresoVideosTR().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresovideosTRDTO.class);
        }).collect(Collectors.toList());
    }
}
