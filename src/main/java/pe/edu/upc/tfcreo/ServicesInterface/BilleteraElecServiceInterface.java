package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface BilleteraElecServiceInterface {
    public void insertarBilleteraElec(BilleteraElectronica billeteraelectronica);
    public void updateBilleteraElec(BilleteraElectronica billeteraelectronica);
    public void eliminarBilleteraElec(int id);
    public List<BilleteraElectronica > listarBilleteraElec();
}
