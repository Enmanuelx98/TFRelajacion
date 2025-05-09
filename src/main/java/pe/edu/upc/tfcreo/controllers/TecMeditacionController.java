package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TecnicaMeditacionDTO;
import pe.edu.upc.tfcreo.entities.TecnicaMeditacion;
import pe.edu.upc.tfcreo.servicesinterface.TecMeditacionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tecmeditacion")
public class TecMeditacionController {
    @Autowired
    private TecMeditacionServiceInterface tecMeditacionService;

    //insertar
    @PostMapping("/insertartecmeditacion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.insertarTecMeditacion(tecnicaMeditacion);
    }

    //modificar
    @PutMapping("/modificartecmeditacion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.updateTecMeditacion(tecnicaMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        tecMeditacionService.eliminarTecMeditacion(id);
    }

    //listar
    @GetMapping("/listartecmeditacion")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<TecnicaMeditacionDTO> List() {
        return tecMeditacionService.listarTecMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TecnicaMeditacionDTO.class);
        }).collect(Collectors.toList());
    }
}

