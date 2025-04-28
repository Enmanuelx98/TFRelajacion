package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Membresia;

import java.time.LocalDateTime;

public class PagosDTO {

    private int idPagos;

    private String tipoPagos;

    private String numeroFacturaPagos;

    private LocalDateTime fechaPagos;

    private double montoPagos;

    private Membresia membresia;

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public String getTipoPagos() {
        return tipoPagos;
    }

    public void setTipoPagos(String tipoPagos) {
        this.tipoPagos = tipoPagos;
    }

    public String getNumeroFacturaPagos() {
        return numeroFacturaPagos;
    }

    public void setNumeroFacturaPagos(String numeroFacturaPagos) {
        this.numeroFacturaPagos = numeroFacturaPagos;
    }

    public LocalDateTime getFechaPagos() {
        return fechaPagos;
    }

    public void setFechaPagos(LocalDateTime fechaPagos) {
        this.fechaPagos = fechaPagos;
    }

    public double getMontoPagos() {
        return montoPagos;
    }

    public void setMontoPagos(double montoPagos) {
        this.montoPagos = montoPagos;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}