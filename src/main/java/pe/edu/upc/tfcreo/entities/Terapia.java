package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Terapia")
public class Terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTerapia;
    @Column(name = "nombreTerapia", length = 50, nullable = false)
    private String nomnreTerapia;
    @Column(name = "fechaAsignacionTerapia")
    private LocalDate fechaAsignacionTerapia;
    @Column(name = "completadoTerapia", nullable = false)
    private Boolean completadoTerapia;

    public Terapia() {
    }

    public Terapia(int idTerapia, String nomnreTerapia, LocalDate fechaAsignacionTerapia, Boolean completadoTerapia) {
        this.idTerapia = idTerapia;
        this.nomnreTerapia = nomnreTerapia;
        this.fechaAsignacionTerapia = fechaAsignacionTerapia;
        this.completadoTerapia = completadoTerapia;
    }

    public int getIdTerapia() {
        return idTerapia;
    }

    public void setIdTerapia(int idTerapia) {
        this.idTerapia = idTerapia;
    }

    public String getNomnreTerapia() {
        return nomnreTerapia;
    }

    public void setNomnreTerapia(String nomnreTerapia) {
        this.nomnreTerapia = nomnreTerapia;
    }

    public LocalDate getFechaAsignacionTerapia() {
        return fechaAsignacionTerapia;
    }

    public void setFechaAsignacionTerapia(LocalDate fechaAsignacionTerapia) {
        this.fechaAsignacionTerapia = fechaAsignacionTerapia;
    }

    public Boolean getCompletadoTerapia() {
        return completadoTerapia;
    }

    public void setCompletadoTerapia(Boolean completadoTerapia) {
        this.completadoTerapia = completadoTerapia;
    }
}

