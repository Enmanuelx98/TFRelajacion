package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.Entity.BilleteraElectronica;
import pe.edu.upc.tfcreo.ServicesInterface.BilleteraElecServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/BilleteraElectronica")
public class BilleteraElecController {
    @Autowired
    private BilleteraElecServiceInterface billeteraElecService;
    //insertar
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void insertar(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billetera = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraElecService.insertarBilleteraElec(billetera);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void editar(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billetera = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraElecService.updateBilleteraElec(billetera);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void eliminar(@PathVariable("id") int id) {
        billeteraElecService.eliminarBilleteraElec(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<BilleteraElectronicaDTO> List() {
        return billeteraElecService.listarBilleteraElec().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BilleteraElectronicaDTO.class);
        }).collect(Collectors.toList());
    }
}
