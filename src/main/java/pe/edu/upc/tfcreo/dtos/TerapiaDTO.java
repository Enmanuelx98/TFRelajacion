package pe.edu.upc.tfcreo.dtos;

import java.time.LocalDate;

public class TerapiaDTO {

    private int idTerapia;

    private String nomnreTerapia;

    private LocalDate fechaAsignacionTerapia;

    private Boolean completadoTerapia;


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
