package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.TarjetaDTO;
import pe.edu.upc.tfcreo.ServicesInterface.TarjetaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tarjeta")
public class TarjetaController {
    @Autowired
    private TarjetaServiceInterface tarjetaService;
    //insertar
    @PostMapping
    public void insertar(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaService.insertarTarjeta(tarjeta);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaService.updateTarjeta(tarjeta);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tarjetaService.eliminarTarjeta(id);
    }

    //listar
    @GetMapping
    public List<TarjetaDTO> List() {
        return tarjetaService.listarTarjeta().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }
}
