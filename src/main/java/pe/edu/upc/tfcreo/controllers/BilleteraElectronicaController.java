package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.entities.BilleteraElectronica;
import pe.edu.upc.tfcreo.servicesinterface.IBilleteraElectronicaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/billeteraelectronicas")
public class BilleteraElectronicaController {

    @Autowired
    private IBilleteraElectronicaService billeteraeS;


    //insertar
    @PostMapping("/insertarbilleteraelectronica")
    public void insertarBilleteraElectronica(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billeteraElectronica = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraeS.insertarBilleteraElectronica(billeteraElectronica);
    }

    //modificar
    @PutMapping("/modificarbilleteraelectronica")
    public void modificarBilleteraElectronica(@RequestBody BilleteraElectronicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        BilleteraElectronica billeteraElectronica = modelMapper.map(dto, BilleteraElectronica.class);
        billeteraeS.updateBilleteraElectronica(billeteraElectronica);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarBilleteraElectronica(@PathVariable ("id") int id) {
        billeteraeS.eliminarBilleteraElectronica(id);
    }

    //Listar
    @GetMapping("/listarbilleteraelectronica")
    public List<BilleteraElectronicaDTO> listarBilleterasElectronica() {
        return billeteraeS.listarBilleteraElectronica().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x,BilleteraElectronicaDTO.class);
        }).collect(Collectors.toList());
    }

    // Nuevo metodo para devolver el monto total pagado por billetera en los últimos 3 meses
    @GetMapping("/montototabilleteraen3meses")
    public Double obtenerMontoTotalBilleteraEn3Meses() {
        return billeteraeS.montototabilleteraen3meses();
    }



}
