package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.VideoTecnicaRespiracionDTO;
import pe.edu.upc.tfcreo.entities.VideoTecnicaRespiracion;
import pe.edu.upc.tfcreo.servicesinterface.IVideoTecnicaRespiracionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Videotecnicarespiracion")
public class VideoTecnicaRespiracionController {

    @Autowired
    private IVideoTecnicaRespiracionService videotrS;

    //insertar
    @PostMapping
    public void insertarVideoTecnicaRespiracion (@RequestBody VideoTecnicaRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideoTecnicaRespiracion videoTecnicaRespiracion = new VideoTecnicaRespiracion();
        videotrS.insertarVideoTecnicaRespiracion(videoTecnicaRespiracion);
    }

    //modificar
    @PutMapping
    public void modificarVideoTecnicaRespiracion (@RequestBody VideoTecnicaRespiracionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        VideoTecnicaRespiracion videoTecnicaRespiracion = new VideoTecnicaRespiracion();
        videotrS.updateVideoTecnicaRespiracion(videoTecnicaRespiracion);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarVideoTecnicaRespiracion (@PathVariable("id") int id) {
        videotrS.eliminarVideoTecnicaRespiracion(id);
    }

    //listar
    @GetMapping("/listarvideotecnicarespiracion")
    public List<VideoTecnicaRespiracionDTO> listarVideoTecnicaRespiracion() {
        return videotrS.listarVideoTecnicaRespiracion().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VideoTecnicaRespiracionDTO.class);
        }).collect(Collectors.toList());
    }

}
