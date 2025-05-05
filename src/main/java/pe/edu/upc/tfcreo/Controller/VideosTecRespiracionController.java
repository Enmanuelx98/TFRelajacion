package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.VideosTecnicasRespiracionDTO;
import pe.edu.upc.tfcreo.Entity.VideosTecnicasRespiracion;
import pe.edu.upc.tfcreo.ServicesImple.VideosTecRespiracionImple;
import pe.edu.upc.tfcreo.ServicesInterface.VideosTecRespiracionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/VideosTecRespiracion")
public class VideosTecRespiracionController {
    @Autowired
    private VideosTecRespiracionInterface videosTecRespiracionservice;

    //insertar
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void insertar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videosTecRespiracionservice.insertarVideosTecRespiracion(videostecnicasrespiracion);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void editar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videosTecRespiracionservice.updateVideosTecRespiracion(videostecnicasrespiracion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void eliminar(@PathVariable("id") int id) {
        videosTecRespiracionservice.eliminarVideosTecRespiracion(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<VideosTecnicasRespiracionDTO> List() {
        return videosTecRespiracionservice.listarVideosTecRespiracion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VideosTecnicasRespiracionDTO.class);
        }).collect(Collectors.toList());
    }
}
