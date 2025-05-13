package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;


import java.time.LocalDate;


@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagos;

    @Column(name = "tipoPago", nullable = false, length = 50)
    private String tipoPago;

    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "montoPagos")
    private double montoPagos;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Users users;

    public Pagos() {
    }

    public Pagos(int idPagos, String tipoPago, LocalDate fechaPago, double montoPagos, Users usuario) {
        this.idPagos = idPagos;
        this.tipoPago = tipoPago;
        this.fechaPago = fechaPago;
        this.montoPagos = montoPagos;
        this.users = usuario;
    }

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
