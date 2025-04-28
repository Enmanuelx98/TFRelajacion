package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "videoTecnicaRespiracion")
public class VideoTecnicaRespiracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnicaRespiracion;
    @Column(name = "nombreTecnicaRespiracion", length = 50, nullable = false)
    private String nombreTecnicaRespiracion;
    @Column(name = "descripcionTecnicaRespiracion", length = 500)
    private String descripcionTecnicaRespiracion;
    @Column(name = "linkTecnicaRespiracion", length = 50, nullable = false)
    private String linkTecnicaRespiracion;

    @ManyToOne
    @JoinColumn(name = "idTerapia")
    private Terapia terapia;

    public VideoTecnicaRespiracion() {
    }

    public VideoTecnicaRespiracion(int idTecnicaRespiracion, String nombreTecnicaRespiracion, String descripcionTecnicaRespiracion, String linkTecnicaRespiracion, Terapia terapia) {
        this.idTecnicaRespiracion = idTecnicaRespiracion;
        this.nombreTecnicaRespiracion = nombreTecnicaRespiracion;
        this.descripcionTecnicaRespiracion = descripcionTecnicaRespiracion;
        this.linkTecnicaRespiracion = linkTecnicaRespiracion;
        this.terapia = terapia;
    }

    public int getIdTecnicaRespiracion() {
        return idTecnicaRespiracion;
    }

    public void setIdTecnicaRespiracion(int idTecnicaRespiracion) {
        this.idTecnicaRespiracion = idTecnicaRespiracion;
    }

    public String getNombreTecnicaRespiracion() {
        return nombreTecnicaRespiracion;
    }

    public void setNombreTecnicaRespiracion(String nombreTecnicaRespiracion) {
        this.nombreTecnicaRespiracion = nombreTecnicaRespiracion;
    }

    public String getDescripcionTecnicaRespiracion() {
        return descripcionTecnicaRespiracion;
    }

    public void setDescripcionTecnicaRespiracion(String descripcionTecnicaRespiracion) {
        this.descripcionTecnicaRespiracion = descripcionTecnicaRespiracion;
    }

    public String getLinkTecnicaRespiracion() {
        return linkTecnicaRespiracion;
    }

    public void setLinkTecnicaRespiracion(String linkTecnicaRespiracion) {
        this.linkTecnicaRespiracion = linkTecnicaRespiracion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}