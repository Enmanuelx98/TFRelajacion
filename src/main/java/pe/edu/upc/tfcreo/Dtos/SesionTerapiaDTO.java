package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Terapia;
import pe.edu.upc.tfcreo.Entity.Usuario;

import java.time.LocalDate;

public class SesionTerapiaDTO {
    private int idSesion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean completado;
    private Usuario usuario;
    private Terapia terapia;

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
