package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.TipoMaterialDTO;
import pe.edu.upc.tfcreo.ServicesInterface.TipoMaterialServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipomaterial")
public class TipoMaterialController {
    @Autowired
    private TipoMaterialServiceInterface tipomS;
    //insertar
    @PostMapping
    public void insertar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipomS.insertarTipoMaterial(tipoMaterial);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipomS.updateTipoMaterial(tipoMaterial);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tipomS.eliminarTipoMaterial(id);
    }

    //listar
    @GetMapping
    public List<TipoMaterialDTO> List() {
        return tipomS.listarTipoMaterial().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoMaterialDTO.class);
        }).collect(Collectors.toList());
    }
}

