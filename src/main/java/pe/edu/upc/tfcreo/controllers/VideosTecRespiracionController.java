package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.VideosTecnicasRespiracionDTO;
import pe.edu.upc.tfcreo.entities.VideosTecnicasRespiracion;
import pe.edu.upc.tfcreo.servicesinterface.VideosTecRespiracionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/videostecrespiracion")
public class VideosTecRespiracionController {
    @Autowired
    private VideosTecRespiracionInterface videosTecRespiracionservice;

    //insertar
    @PostMapping("/insertarvideostecrespiracion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videosTecRespiracionservice.insertarVideosTecRespiracion(videostecnicasrespiracion);
    }

    //modificar
    @PutMapping("/modificarvideostecrespiracion")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videosTecRespiracionservice.updateVideosTecRespiracion(videostecnicasrespiracion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        videosTecRespiracionservice.eliminarVideosTecRespiracion(id);
    }

    //listar
    @GetMapping("/listarvideostecrespiracion")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<VideosTecnicasRespiracionDTO> List() {
        return videosTecRespiracionservice.listarVideosTecRespiracion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VideosTecnicasRespiracionDTO.class);
        }).collect(Collectors.toList());
    }
}
