package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.TipoMaterialDTO;
import pe.edu.upc.tfcreo.Entity.TipoMaterial;
import pe.edu.upc.tfcreo.ServicesInterface.TipoMaterialServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipomaterial")
public class TipoMaterialController {
    @Autowired
    private TipoMaterialServiceInterface tipoMaterialService;
    //insertar
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipoMaterialService.insertarTipoMaterial(tipoMaterial);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipoMaterialService.updateTipoMaterial(tipoMaterial);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tipoMaterialService.eliminarTipoMaterial(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<TipoMaterialDTO> List() {
        return tipoMaterialService.listarTipoMaterial().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoMaterialDTO.class);
        }).collect(Collectors.toList());
    }
}

