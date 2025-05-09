package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MembresiaDTO;
import pe.edu.upc.tfcreo.entities.Membresia;
import pe.edu.upc.tfcreo.servicesinterface.MembresiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private MembresiaServiceInterface membresiaService;

    //insertar
    @PostMapping("/insertarmembresia")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.insertarMembresia(membresia);
    }

    //modificar
    @PutMapping("/modificarmembresia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.updateMembresia(membresia);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        membresiaService.eliminarMembresia(id);
    }

    //listar
    @GetMapping("/listarmembresia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MembresiaDTO> List() {
        return membresiaService.listarMembresia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
}
