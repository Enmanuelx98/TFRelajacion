package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "EvaluacionPsicologica")
public class EvaluacionPsicologica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacionPsicologia;

    @Column(name = "nombreEvaluacionPsicologia", nullable = false, length = 100)
    private String nombreEvaluacionPsicologia;

    @Column(name = "aprobadoEvaluacionPsicologica", nullable = false)
    private Boolean aprobadoEvaluacionPsicologia;

    @ManyToOne
    @JoinColumn(name = "idTerapia")
    private Terapia terapia;

    public EvaluacionPsicologica() {
    }

    public EvaluacionPsicologica(int idEvaluacionPsicologia, String nombreEvaluacionPsicologia, Boolean aprobadoEvaluacionPsicologia, Terapia terapia) {
        this.idEvaluacionPsicologia = idEvaluacionPsicologia;
        this.nombreEvaluacionPsicologia = nombreEvaluacionPsicologia;
        this.aprobadoEvaluacionPsicologia = aprobadoEvaluacionPsicologia;
        this.terapia = terapia;
    }

    public int getIdEvaluacionPsicologia() {
        return idEvaluacionPsicologia;
    }

    public void setIdEvaluacionPsicologia(int idEvaluacionPsicologia) {
        this.idEvaluacionPsicologia = idEvaluacionPsicologia;
    }

    public String getNombreEvaluacionPsicologia() {
        return nombreEvaluacionPsicologia;
    }

    public void setNombreEvaluacionPsicologia(String nombreEvaluacionPsicologia) {
        this.nombreEvaluacionPsicologia = nombreEvaluacionPsicologia;
    }

    public Boolean getAprobadoEvaluacionPsicologia() {
        return aprobadoEvaluacionPsicologia;
    }

    public void setAprobadoEvaluacionPsicologia(Boolean aprobadoEvaluacionPsicologia) {
        this.aprobadoEvaluacionPsicologia = aprobadoEvaluacionPsicologia;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
