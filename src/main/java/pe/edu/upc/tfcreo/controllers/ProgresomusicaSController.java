package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.ProgresomusicaSDTO;
import pe.edu.upc.tfcreo.entities.ProgresomusicaS;
import pe.edu.upc.tfcreo.servicesinterface.ProgresomusicaSInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/progresomusicas")
public class ProgresomusicaSController {
    @Autowired
    private ProgresomusicaSInterface progresomusicaSInterface;

    //insertar
    @PostMapping("/insertarprogresomusicas")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.insertarProgresoMusica(progresomusicaS);
    }

    //modificar
    @PutMapping("/modificarprogresomusicas")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.updateProgresoMusica(progresomusicaS);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresomusicaSInterface.eliminarProgresoMusica(id);
    }

    //listar
    @GetMapping("/listarprogresomusicas")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresomusicaSDTO> List() {
        return progresomusicaSInterface.listarProgresoMusica().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresomusicaSDTO.class);
        }).collect(Collectors.toList());
    }
}
