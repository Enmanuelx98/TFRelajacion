package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MusicaRelajacionDTO;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaRelajacionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/musicarelax")
public class MusicaRelajacionController {
    @Autowired
    private MusicaRelajacionInterface musicaRelajacionservice;
    @PostMapping
    public void insertar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.insertarMusicaRelax(musicarelajacion);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.updateMusicaRelax(musicarelajacion);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        musicaRelajacionservice.eliminarMusicaRelax(id);
    }

    //listar
    @GetMapping
    public List<MusicaRelajacionDTO> List() {
        return musicaRelajacionservice.listarMusicaRelax().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaRelajacionDTO.class);
        }).collect(Collectors.toList());
    }
}
