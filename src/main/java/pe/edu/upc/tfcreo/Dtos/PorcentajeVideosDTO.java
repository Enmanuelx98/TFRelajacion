package pe.edu.upc.tfcreo.Dtos;

public class PorcentajeVideosDTO {
    private int idsesion;
    private double porcentaje;

    public PorcentajeVideosDTO(){}

    public PorcentajeVideosDTO(int idsesion, double porcentaje) {
        this.idsesion = idsesion;
        this.porcentaje = porcentaje;
    }

    public int getIdsesion() {
        return idsesion;
    }

    public void setIdsesion(int idsesion) {
        this.idsesion = idsesion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
