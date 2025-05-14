package pe.edu.upc.tfcreo.Dtos;


import jakarta.persistence.*;
import pe.edu.upc.tfcreo.Entity.Users;


import java.time.LocalDate;


public class PagosDTO {

    private int idPagos;

    private String tipoPago;

    private LocalDate fechaPago;

    private double montoPagos;

    private Users users;

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

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
