package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.RolDTO;
import pe.edu.upc.tfcreo.Entity.Rol;
import pe.edu.upc.tfcreo.ServicesInterface.RolSeriveInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolSeriveInterface rolSerive;

    //insertar
    @PostMapping
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(dto, Rol.class);
        rolSerive.insertarRol(rol);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody RolDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(dto, Rol.class);
        rolSerive.updateRol(rol);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rolSerive.eliminarRol(id);
    }

    //listar
    @GetMapping
    public List<RolDTO> List() {
        return rolSerive.listarRol().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }

}
