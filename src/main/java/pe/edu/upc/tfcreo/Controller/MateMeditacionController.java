package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;
import pe.edu.upc.tfcreo.ServicesInterface.MateMeditacionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/MateMeditacion")
public class MateMeditacionController {
    @Autowired
    private MateMeditacionServiceInterface mateMeditacionService;
    //insertar
    @PostMapping
    public void insertar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.insertarMateMeditacion(materialMeditacion);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.updateMateMeditacion(materialMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        mateMeditacionService.eliminarMateMeditacion(id);
    }

    //listar
    @GetMapping
    public List<MaterialMeditacionDTO> List() {
        return mateMeditacionService.listarMateMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialMeditacionDTO.class);
        }).collect(Collectors.toList());
    }
    
    @GetMapping("/busqueda")
    public  List<MaterialMeditacionDTO> buscar(@RequestParam String nombre) {

        return mateMeditacionService.find(nombre).stream().map(    x  -> {
            ModelMapper m=new ModelMapper();
            return  m.map(x,MaterialMeditacionDTO.class);
        }).collect(Collectors.toList());
    }

}
