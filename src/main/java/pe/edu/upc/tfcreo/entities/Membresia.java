package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;
import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;

@Entity
@Table(name = "membresia")
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;

    @Column(name = "fechaInicioMembresia")
    private LocalDate fechaInicioMenbresia;
    @Column(name = "fechaFinMembresia")
    private LocalDate fechaFinMenbresia;
    @Column(name = "activadoMembresia", nullable = false)
    private Boolean activadoMembresia;


    public Membresia() {
    }

    public Membresia(int idMembresia, LocalDate fechaInicioMenbresia, LocalDate fechaFinMenbresia, Boolean activadoMembresia) {
        this.idMembresia = idMembresia;
        this.fechaInicioMenbresia = fechaInicioMenbresia;
        this.fechaFinMenbresia = fechaFinMenbresia;
        this.activadoMembresia = activadoMembresia;
    }

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
