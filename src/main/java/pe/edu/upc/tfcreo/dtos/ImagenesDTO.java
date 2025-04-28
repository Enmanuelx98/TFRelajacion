package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Material;

public class ImagenesDTO {


    private int idImagenes;

    private String nombreImagenes;

    private String linkImagenes;

    private String descripcionImagenes;

    private Material material;


    public int getIdImagenes() {
        return idImagenes;
    }

    public void setIdImagenes(int idImagenes) {
        this.idImagenes = idImagenes;
    }

    public String getNombreImagenes() {
        return nombreImagenes;
    }

    public void setNombreImagenes(String nombreImagenes) {
        this.nombreImagenes = nombreImagenes;
    }

    public String getLinkImagenes() {
        return linkImagenes;
    }

    public void setLinkImagenes(String linkImagenes) {
        this.linkImagenes = linkImagenes;
    }

    public String getDescripcionImagenes() {
        return descripcionImagenes;
    }

    public void setDescripcionImagenes(String descripcionImagenes) {
        this.descripcionImagenes = descripcionImagenes;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}