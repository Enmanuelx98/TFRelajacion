package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.entities.MaterialMeditacion;
import pe.edu.upc.tfcreo.servicesinterface.MateMeditacionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/matemeditacion")
public class MateMeditacionController {
    @Autowired
    private MateMeditacionServiceInterface mateMeditacionService;

    //insertar
    @PostMapping("/insertarmatemeditacion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.insertarMateMeditacion(materialMeditacion);
    }

    //modificar
    @PutMapping("/modificarmatemeditacion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.updateMateMeditacion(materialMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        mateMeditacionService.eliminarMateMeditacion(id);
    }

    //listar
    @GetMapping("/listarmatemeditacion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MaterialMeditacionDTO> List() {
        return mateMeditacionService.listarMateMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialMeditacionDTO.class);
        }).collect(Collectors.toList());
    }
}
