package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.ProgresoMaterialMediDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresomusicaSDTO;
import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresoMaterialMediInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/ProgresoMaterialMedi")
public class ProgresoMaterialMediController {
    @Autowired
    private ProgresoMaterialMediInterface progresoMaterialMediInterface;
    //insertar
    @PostMapping
    public void insertar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.insertarProgresoMaterialMedi(progresomaterialMedi);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.updateProgresoMaterialMedi(progresomaterialMedi);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        progresoMaterialMediInterface.eliminarProgresoMaterialMedi(id);
    }

    //listar
    @GetMapping
    public List<ProgresoMaterialMediDTO> List() {
        return progresoMaterialMediInterface.listarProgresoMaterialMedi().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresoMaterialMediDTO.class);
        }).collect(Collectors.toList());
    }
    //buscar
    @GetMapping("/busqueda")
    public  List<ProgresoMaterialMediDTO> buscar(@RequestParam String nombre) {

        return progresoMaterialMediInterface.find(nombre).stream().map(    x  -> {
            ModelMapper m=new ModelMapper();
            return  m.map(x,ProgresoMaterialMediDTO.class);
        }).collect(Collectors.toList());
    }
}
