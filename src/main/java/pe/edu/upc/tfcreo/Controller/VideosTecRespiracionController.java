package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.VideosTecnicasRespiracionDTO;
import pe.edu.upc.tfcreo.Entity.VideosTecnicasRespiracion;
import pe.edu.upc.tfcreo.ServicesImple.VideosTecRespiracionImple;
import pe.edu.upc.tfcreo.ServicesInterface.VideosTecRespiracionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/VideosTecRespiracion")
public class VideosTecRespiracionController {
    @Autowired
    private VideosTecRespiracionInterface videostrS;

    //insertar
    @PostMapping
    public void insertar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videostrS.insertarVideosTecRespiracion(videostecnicasrespiracion);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody VideosTecnicasRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideosTecnicasRespiracion videostecnicasrespiracion = modelMapper.map(dto, VideosTecnicasRespiracion.class);
        videostrS.updateVideosTecRespiracion(videostecnicasrespiracion);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        videostrS.eliminarVideosTecRespiracion(id);
    }

    //listar
    @GetMapping
    public List<VideosTecnicasRespiracionDTO> List() {
        return videostrS.listarVideosTecRespiracion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VideosTecnicasRespiracionDTO.class);
        }).collect(Collectors.toList());
    }
}
