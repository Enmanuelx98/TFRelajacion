package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.RolDTO;
import pe.edu.upc.tfcreo.entities.Rol;
import pe.edu.upc.tfcreo.servicesinterface.RolSeriveInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolSeriveInterface rolSerive;

    //insertar
    @PostMapping("/insertarrol")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(dto, Rol.class);
        rolSerive.insertarRol(rol);
    }

    //modificar
    @PutMapping("/modificarrol")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody RolDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(dto, Rol.class);
        rolSerive.updateRol(rol);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        rolSerive.eliminarRol(id);
    }

    //listar
    @GetMapping("/listarrol")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RolDTO> List() {
        return rolSerive.listarRol().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }

}
