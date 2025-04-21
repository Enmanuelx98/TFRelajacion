package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.TecnicaMeditacionDTO;
import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;
import pe.edu.upc.tfcreo.ServicesInterface.TecMeditacionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TecMeditacion")
public class TecMeditacionController {
    @Autowired
    private TecMeditacionServiceInterface tecMeditacionService;
    //insertar
    @PostMapping
    public void insertar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.insertarTecMeditacion(tecnicaMeditacion);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.updateTecMeditacion(tecnicaMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tecMeditacionService.eliminarTecMeditacion(id);
    }

    //listar
    @GetMapping
    public List<TecnicaMeditacionDTO> List() {
        return tecMeditacionService.listarTecMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TecnicaMeditacionDTO.class);
        }).collect(Collectors.toList());
    }
}

