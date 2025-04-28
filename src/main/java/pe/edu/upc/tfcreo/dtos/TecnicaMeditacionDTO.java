package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Terapia;

public class TecnicaMeditacionDTO {

    private int idTecnicaMeditacion;

    private String nombreTecnicaMeditacion;

    private String descripcionTecnicaMeditacion;

    private boolean completadoTecnicaMeditacion;

    private Terapia terapia;


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