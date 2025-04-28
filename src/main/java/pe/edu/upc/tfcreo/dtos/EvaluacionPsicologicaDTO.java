package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Terapia;

public class EvaluacionPsicologicaDTO {
    private int idEvaluacionPsicologia;

    private String nombreEvaluacionPsicologia;

    private Boolean aprobadoEvaluacionPsicologia;

    private Terapia terapia;

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

