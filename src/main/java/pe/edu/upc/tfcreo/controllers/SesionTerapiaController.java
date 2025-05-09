package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.SesionTerapiaDTO;
import pe.edu.upc.tfcreo.entities.SesionTerapia;
import pe.edu.upc.tfcreo.servicesinterface.SesionTerapiaInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sesionterapia")
public class SesionTerapiaController {
    @Autowired
    private SesionTerapiaInterface sesionTerapiaInterface;

    //insertar
    @PostMapping("/insertarsesionterapia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.insertarSesionTerapia(sesion);
    }

    //modificar
    @PutMapping("/modificarsesionterapia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.updateSesionTerapia(sesion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        sesionTerapiaInterface.eliminarSesionTerapia(id);
    }

    //listar
    @GetMapping("/listarsesionterapia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SesionTerapiaDTO> List() {
        return sesionTerapiaInterface.listarSesionTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }
}
