package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.TecnicaMeditacion;

public class MaterialDTO {

    private int idMaterial;

    private String nombreMaterial;

    private String descripcionMaterial;

    private TecnicaMeditacion tecnicaMeditacion;


    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public TecnicaMeditacion getTecnicaMeditacion() {
        return tecnicaMeditacion;
    }

    public void setTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion) {
        this.tecnicaMeditacion = tecnicaMeditacion;
    }
}