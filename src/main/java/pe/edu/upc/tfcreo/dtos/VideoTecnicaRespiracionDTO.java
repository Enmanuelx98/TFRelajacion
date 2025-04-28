package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Terapia;

public class VideoTecnicaRespiracionDTO {

    private int idTecnicaRespiracion;

    private String nombreTecnicaRespiracion;

    private String descripcionTecnicaRespiracion;

    private String linkTecnicaRespiracion;

    private Terapia terapia;


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