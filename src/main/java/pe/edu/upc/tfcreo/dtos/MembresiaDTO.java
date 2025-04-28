package pe.edu.upc.tfcreo.dtos;

import java.time.LocalDate;

public class MembresiaDTO {

    private int idMembresia;

    private LocalDate fechaInicioMenbresia;

    private LocalDate fechaFinMenbresia;

    private Boolean activadoMembresia;


    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public LocalDate getFechaInicioMenbresia() {
        return fechaInicioMenbresia;
    }

    public void setFechaInicioMenbresia(LocalDate fechaInicioMenbresia) {
        this.fechaInicioMenbresia = fechaInicioMenbresia;
    }

    public LocalDate getFechaFinMenbresia() {
        return fechaFinMenbresia;
    }

    public void setFechaFinMenbresia(LocalDate fechaFinMenbresia) {
        this.fechaFinMenbresia = fechaFinMenbresia;
    }

    public Boolean getActivadoMembresia() {
        return activadoMembresia;
    }

    public void setActivadoMembresia(Boolean activadoMembresia) {
        this.activadoMembresia = activadoMembresia;
    }
}