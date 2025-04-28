package pe.edu.upc.tfcreo.dtos;


import pe.edu.upc.tfcreo.entities.Pagos;

public class BilleteraElectronicaDTO {

    private int idBilleteraElectronica;

    private String companiaBilleteraElectronica;

    private String nombreTitularBilleteraElectronica;

    private String evidenciaBilleteraElectronica;

    private Pagos pagos;


    public int getIdBilleteraElectronica() {
        return idBilleteraElectronica;
    }

    public void setIdBilleteraElectronica(int idBilleteraElectronica) {
        this.idBilleteraElectronica = idBilleteraElectronica;
    }

    public String getCompaniaBilleteraElectronica() {
        return companiaBilleteraElectronica;
    }

    public void setCompaniaBilleteraElectronica(String companiaBilleteraElectronica) {
        this.companiaBilleteraElectronica = companiaBilleteraElectronica;
    }

    public String getNombreTitularBilleteraElectronica() {
        return nombreTitularBilleteraElectronica;
    }

    public void setNombreTitularBilleteraElectronica(String nombreTitularBilleteraElectronica) {
        this.nombreTitularBilleteraElectronica = nombreTitularBilleteraElectronica;
    }

    public String getEvidenciaBilleteraElectronica() {
        return evidenciaBilleteraElectronica;
    }

    public void setEvidenciaBilleteraElectronica(String evidenciaBilleteraElectronica) {
        this.evidenciaBilleteraElectronica = evidenciaBilleteraElectronica;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
}