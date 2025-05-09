package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.entities.BilleteraElectronica;
import pe.edu.upc.tfcreo.servicesinterface.BilleteraElecServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/billeteraelectronica")
public class BilleteraElecController {
    @Autowired
    private BilleteraElecServiceInterface billeteraElecService;

    //insertar
    @PostMapping("/insertarbilleteraelectronica")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billetera = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraElecService.insertarBilleteraElec(billetera);
    }

    //modificar
    @PutMapping("/modificarbilleteraelectronica")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void editar(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billetera = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraElecService.updateBilleteraElec(billetera);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        billeteraElecService.eliminarBilleteraElec(id);
    }

    //listar
    @GetMapping("/listarbilleteraelectronica")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BilleteraElectronicaDTO> List() {
        return billeteraElecService.listarBilleteraElec().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BilleteraElectronicaDTO.class);
        }).collect(Collectors.toList());
    }

    // Nuevo metodo para devolver el monto total pagado por billetera en los últimos 3 meses
    @GetMapping("/montototalbilleterafecha")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Double obtenerMontoTotalBilleteraEn3Meses() {
        return billeteraElecService.montototabilleteraen3meses();
    }


}
