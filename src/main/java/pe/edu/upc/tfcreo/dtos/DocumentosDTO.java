package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Material;

public class DocumentosDTO {


    private int idDocumentos;

    private String nombreDocumentos;

    private String linkDocumentos;

    private String descripcionDocumentos;

    private Material material;


    public int getIdDocumentos() {
        return idDocumentos;
    }

    public void setIdDocumentos(int idDocumentos) {
        this.idDocumentos = idDocumentos;
    }

    public String getNombreDocumentos() {
        return nombreDocumentos;
    }

    public void setNombreDocumentos(String nombreDocumentos) {
        this.nombreDocumentos = nombreDocumentos;
    }

    public String getLinkDocumentos() {
        return linkDocumentos;
    }

    public void setLinkDocumentos(String linkDocumentos) {
        this.linkDocumentos = linkDocumentos;
    }

    public String getDescripcionDocumentos() {
        return descripcionDocumentos;
    }

    public void setDescripcionDocumentos(String descripcionDocumentos) {
        this.descripcionDocumentos = descripcionDocumentos;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}