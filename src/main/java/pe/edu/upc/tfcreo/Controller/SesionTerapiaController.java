package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.SesionTerapiaDTO;
import pe.edu.upc.tfcreo.Dtos.TarjetaDTO;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;
import pe.edu.upc.tfcreo.Entity.Tarjeta;
import pe.edu.upc.tfcreo.ServicesInterface.SesionTerapiaInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/SesionTerapia")
public class SesionTerapiaController {
    @Autowired
    private SesionTerapiaInterface sesionTerapiaInterface;
    //insertar
    @PostMapping
    public void insertar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.insertarSesionTerapia(sesion);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.updateSesionTerapia(sesion);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        sesionTerapiaInterface.eliminarSesionTerapia(id);
    }

    //listar
    @GetMapping
    public List<SesionTerapiaDTO> List() {
        return sesionTerapiaInterface.listarSesionTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }
}
