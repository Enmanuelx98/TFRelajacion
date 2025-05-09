package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TerapiaDTO;
import pe.edu.upc.tfcreo.entities.Terapia;
import pe.edu.upc.tfcreo.servicesinterface.TerapiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/terapia")
public class TerapiaController {
    @Autowired
    private TerapiaServiceInterface terapiaService;

    //insertar
    @PostMapping("/insertarterapia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaService.insertarTerapia(terapia);
    }

    //modificar
    @PutMapping("/modificarterapia")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaService.updateTerapia(terapia);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        terapiaService.eliminarTerapia(id);
    }

    //listar
    @GetMapping("/listarterapia")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<TerapiaDTO> List() {
        return terapiaService.listarTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TerapiaDTO.class);
        }).collect(Collectors.toList());
    }
}

