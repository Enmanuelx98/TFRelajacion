package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.BilleteraElectronica;
import pe.edu.upc.tfcreo.repositories.IBilleteraElectronicaRepository;
import pe.edu.upc.tfcreo.servicesinterface.IBilleteraElectronicaService;

import java.util.List;

@Service
public class BilleteraElectronicaServiceImplement implements IBilleteraElectronicaService {

    @Autowired
    private IBilleteraElectronicaRepository billeteraeR;

    @Override
    public void insertarBilleteraElectronica(BilleteraElectronica billeteraElectronica) {

    }

    @Override
    public void updateBilleteraElectronica(BilleteraElectronica billeteraElectronica) {

    }

    @Override
    public void eliminarBilleteraElectronica(int id) {

    }

    @Override
    public List<BilleteraElectronica> listarBilleteraElectronica() {
        return billeteraeR.findAll();
    }

    @Override
    public double montototabilleteraen3meses() {
        return billeteraeR.montototabilleteraen3meses();
    }
}
