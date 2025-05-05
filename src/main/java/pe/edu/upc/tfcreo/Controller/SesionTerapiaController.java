package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.SesionTerapiaDTO;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;
import pe.edu.upc.tfcreo.ServicesInterface.SesionTerapiaInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/SesionTerapia")
public class SesionTerapiaController {
    @Autowired
    private SesionTerapiaInterface sesionTerapiaInterface;
    //insertar
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void insertar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.insertarSesionTerapia(sesion);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void editar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.updateSesionTerapia(sesion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void eliminar(@PathVariable("id") int id) {
        sesionTerapiaInterface.eliminarSesionTerapia(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<SesionTerapiaDTO> List() {
        return sesionTerapiaInterface.listarSesionTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }

    //listarsesiones por usuario
    @GetMapping("/sesionUsuario/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<SesionTerapiaDTO> ListsesionUsuario(@PathVariable("id") int id) {
        return sesionTerapiaInterface.quantitySesionesbyUsuario(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }
    //listarsesiones completadas del usuario
    @GetMapping("/sesionCompletoUsuario/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<SesionTerapiaDTO> ListsesionCompletoUsuario(@PathVariable("id") int id) {
        return sesionTerapiaInterface.quantitySesionesCompletobyUsuario(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }


}
