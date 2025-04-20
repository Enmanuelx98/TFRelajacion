package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;


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

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    public Pagos() {}

    public Pagos(LocalDate fechaPago, int idPagos, String tipoPago, Usuario usuario) {
        this.fechaPago = fechaPago;
        this.idPagos = idPagos;
        this.tipoPago = tipoPago;
        this.usuario = usuario;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
