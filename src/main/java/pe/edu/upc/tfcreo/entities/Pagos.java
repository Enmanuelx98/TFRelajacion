package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagos;

    @Column(name = "tipoPagos",length = 50, nullable = false )
    private String tipoPagos;
    @Column(name = "numeroFacturaPagos",length = 10)
    private String numeroFacturaPagos;
    @Column(name = "montoPagos")
    private double montoPagos;

    @CreationTimestamp
    @Column(name = "fechaPagos",updatable = false)
    private LocalDateTime fechaPagos;

    @ManyToOne
    @JoinColumn(name = "idMembresia")
    private Membresia membresia;

    public Pagos() {
    }

    public Pagos(int idPagos, String tipoPagos, String numeroFacturaPagos, int montoPagos, LocalDateTime fechaPagos, Membresia membresia) {
        this.idPagos = idPagos;
        this.tipoPagos = tipoPagos;
        this.numeroFacturaPagos = numeroFacturaPagos;
        this.montoPagos = montoPagos;
        this.fechaPagos = fechaPagos;
        this.membresia = membresia;
    }

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

    public double getMontoPagos() {
        return montoPagos;
    }

    public void setMontoPagos(double montoPagos) {
        this.montoPagos = montoPagos;
    }

    public LocalDateTime getFechaPagos() {
        return fechaPagos;
    }

    public void setFechaPagos(LocalDateTime fechaPagos) {
        this.fechaPagos = fechaPagos;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}