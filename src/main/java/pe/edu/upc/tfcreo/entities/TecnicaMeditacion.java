package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TecnicaMeditacion")
public class TecnicaMeditacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnicaMeditacion;

    @Column(name = "nombreTecnicaMeditacion", length = 50, nullable = false)
    private String nombreTecnicaMeditacion;
    @Column(name = "descripcionTecnicaMeditacion", length = 500, nullable = false)
    private String descripcionTecnicaMeditacion;
    @Column(name = "completadoTecnicaMeditacion")
    private boolean completadoTecnicaMeditacion;

    @ManyToOne
    @JoinColumn(name = "idTerapia")
    private Terapia terapia;

    public TecnicaMeditacion() {
    }

    public TecnicaMeditacion(int idTecnicaMeditacion, String nombreTecnicaMeditacion, String descripcionTecnicaMeditacion, boolean completadoTecnicaMeditacion, Terapia terapia) {
        this.idTecnicaMeditacion = idTecnicaMeditacion;
        this.nombreTecnicaMeditacion = nombreTecnicaMeditacion;
        this.descripcionTecnicaMeditacion = descripcionTecnicaMeditacion;
        this.completadoTecnicaMeditacion = completadoTecnicaMeditacion;
        this.terapia = terapia;
    }

    public int getIdTecnicaMeditacion() {
        return idTecnicaMeditacion;
    }

    public void setIdTecnicaMeditacion(int idTecnicaMeditacion) {
        this.idTecnicaMeditacion = idTecnicaMeditacion;
    }

    public String getNombreTecnicaMeditacion() {
        return nombreTecnicaMeditacion;
    }

    public void setNombreTecnicaMeditacion(String nombreTecnicaMeditacion) {
        this.nombreTecnicaMeditacion = nombreTecnicaMeditacion;
    }

    public String getDescripcionTecnicaMeditacion() {
        return descripcionTecnicaMeditacion;
    }

    public void setDescripcionTecnicaMeditacion(String descripcionTecnicaMeditacion) {
        this.descripcionTecnicaMeditacion = descripcionTecnicaMeditacion;
    }

    public boolean isCompletadoTecnicaMeditacion() {
        return completadoTecnicaMeditacion;
    }

    public void setCompletadoTecnicaMeditacion(boolean completadoTecnicaMeditacion) {
        this.completadoTecnicaMeditacion = completadoTecnicaMeditacion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
