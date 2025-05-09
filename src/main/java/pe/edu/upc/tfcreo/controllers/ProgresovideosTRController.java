package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.ProgresovideosTRDTO;
import pe.edu.upc.tfcreo.entities.ProgresovideosTR;
import pe.edu.upc.tfcreo.servicesinterface.ProgresovideosTRInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/progresovideostr")
public class ProgresovideosTRController {
    @Autowired
    private ProgresovideosTRInterface progresovideosTRInterface;

    //insertar
    @PostMapping("/insertarprogresovideostr")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.insertarProgresoVideosTR(progresovideosTR);
    }

    //modificar
    @PutMapping("/modificarprogresovideostr")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.updateProgresoVideosTR(progresovideosTR);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresovideosTRInterface.eliminarProgresoVideosTR(id);
    }

    //listar
    @GetMapping("/listarprogresovideostr")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresovideosTRDTO> List() {
        return progresovideosTRInterface.listarProgresoVideosTR().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresovideosTRDTO.class);
        }).collect(Collectors.toList());
    }
}
