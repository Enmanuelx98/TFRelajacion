package pe.edu.upc.tfcreo.dtos;


import pe.edu.upc.tfcreo.entities.Usuario;

import java.time.LocalDate;


public class PagosDTO {

    private int idPagos;

    private String tipoPago;

    private LocalDate fechaPago;

    private double montoPagos;

    private Usuario usuario;

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoPagos() {
        return montoPagos;
    }

    public void setMontoPagos(double montoPagos) {
        this.montoPagos = montoPagos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
