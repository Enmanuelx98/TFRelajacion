package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.processing.Pattern;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(name = "nombreTitular",length = 50, nullable = false)
    private String nombreTitularTarjeta;
    @Column(name = "numeroTarjeta",length = 16, nullable = false)
    private String numeroTarjeta;
    @Column(name = "cvvTarjeta",length = 4, nullable = false)
    private int cvvTarjeta;
    @Column(name = "fechaCaducidadTarjeta",length = 4, nullable = false)
    private String fechaCaducidadTarjeta;

    @ManyToOne
    @JoinColumn(name = "idPagos")
    private Pagos pagos;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String nombreTitularTarjeta, String numeroTarjeta, int cvvTarjeta, String fechaCaducidadTarjeta, Pagos pagos) {
        this.idTarjeta = idTarjeta;
        this.nombreTitularTarjeta = nombreTitularTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.cvvTarjeta = cvvTarjeta;
        this.fechaCaducidadTarjeta = fechaCaducidadTarjeta;
        this.pagos = pagos;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreTitularTarjeta() {
        return nombreTitularTarjeta;
    }

    public void setNombreTitularTarjeta(String nombreTitularTarjeta) {
        this.nombreTitularTarjeta = nombreTitularTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvvTarjeta() {
        return cvvTarjeta;
    }

    public void setCvvTarjeta(int cvvTarjeta) {
        this.cvvTarjeta = cvvTarjeta;
    }

    public String getFechaCaducidadTarjeta() {
        return fechaCaducidadTarjeta;
    }

    public void setFechaCaducidadTarjeta(String fechaCaducidadTarjeta) {
        this.fechaCaducidadTarjeta = fechaCaducidadTarjeta;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
}

