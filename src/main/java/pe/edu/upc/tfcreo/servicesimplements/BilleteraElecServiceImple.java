package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.BilleteraElectronica;
import pe.edu.upc.tfcreo.repositories.BilleteraElecRepository;
import pe.edu.upc.tfcreo.servicesinterface.BilleteraElecServiceInterface;

import java.util.List;
@Service
public class BilleteraElecServiceImple implements BilleteraElecServiceInterface {
    @Autowired
    private BilleteraElecRepository BilleteraElecRepository;
    @Override
    public void insertarBilleteraElec(BilleteraElectronica billeteraelectronica) {
        BilleteraElecRepository.save(billeteraelectronica);
    }

    @Override
    public void updateBilleteraElec(BilleteraElectronica billeteraelectronica) {
        BilleteraElecRepository.save(billeteraelectronica);

    }

    @Override
    public void eliminarBilleteraElec(int id) {
        BilleteraElecRepository.deleteById(id);
    }

    @Override
    public List<BilleteraElectronica> listarBilleteraElec() {
        return BilleteraElecRepository.findAll();
    }

    @Override
    public double montototabilleteraen3meses() {
        return BilleteraElecRepository.montototabilleteraen3meses();
    }
}
