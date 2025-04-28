package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.BilleteraElectronica;

import java.util.List;

public interface IBilleteraElectronicaService {

    public void insertarBilleteraElectronica(BilleteraElectronica billeteraElectronica);
    public void updateBilleteraElectronica(BilleteraElectronica billeteraElectronica);
    public void eliminarBilleteraElectronica(int id);
    public List<BilleteraElectronica> listarBilleteraElectronica();

    public double montototabilleteraen3meses();
}
