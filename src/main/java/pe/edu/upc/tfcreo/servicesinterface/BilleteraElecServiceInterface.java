package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.BilleteraElectronica;

import java.util.List;

public interface BilleteraElecServiceInterface {
    public void insertarBilleteraElec(BilleteraElectronica billeteraelectronica);
    public void updateBilleteraElec(BilleteraElectronica billeteraelectronica);
    public void eliminarBilleteraElec(int id);
    public List<BilleteraElectronica > listarBilleteraElec();

    public double montototabilleteraen3meses();
}
