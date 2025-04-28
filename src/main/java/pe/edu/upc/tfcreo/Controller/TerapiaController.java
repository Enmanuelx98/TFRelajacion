package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.TerapiaDTO;
import pe.edu.upc.tfcreo.ServicesInterface.TerapiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/terapia")
public class TerapiaController {
    @Autowired
    private TerapiaServiceInterface terapiaS;
    //insertar
    @PostMapping
    public void insertar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaS.insertarTerapia(terapia);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaS.updateTerapia(terapia);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        terapiaS.eliminarTerapia(id);
    }

    //listar
    @GetMapping
    public List<TerapiaDTO> List() {
        return terapiaS.listarTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TerapiaDTO.class);
        }).collect(Collectors.toList());
    }
}

