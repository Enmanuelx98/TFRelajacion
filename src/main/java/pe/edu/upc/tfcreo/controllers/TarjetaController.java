package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TarjetaDTO;
import pe.edu.upc.tfcreo.entities.Tarjeta;
import pe.edu.upc.tfcreo.servicesinterface.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tarjetas")
public class TarjetaController {

    @Autowired
    private ITarjetaService tarjetaS;

    @PostMapping("/insertartarjeta")
    public void insertarTarjeta(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaS.insertarTarjeta(tarjeta);
    }

    @PutMapping("/modificartarjeta")
    public void modificarTarjeta(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaS.updateTarjeta(tarjeta);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarjeta(@PathVariable ("id") int id) { tarjetaS.eliminarTarjeta(id);}

    @GetMapping("/listartarjeta")
    public List<TarjetaDTO> listarTarjeta() {
        return tarjetaS.listarTarjetas().stream().map(x-> {
            ModelMapper m=new ModelMapper();
            return m.map(x,TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/montototaltarjetaen3meses")
    public Double obtenerMontoTotalTarjetaEn3Meses() {
        return tarjetaS.montototatarjetaen3meses();
    }



}
