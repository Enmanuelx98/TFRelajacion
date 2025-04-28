package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Material;

public class VideosDTO {

    private int idVideos;

    private String nombreVideos;

    private String linkVideos;

    private String descripcionVideos;

    private Material material;


    public int getIdVideos() {
        return idVideos;
    }

    public void setIdVideos(int idVideos) {
        this.idVideos = idVideos;
    }

    public String getNombreVideos() {
        return nombreVideos;
    }

    public void setNombreVideos(String nombreVideos) {
        this.nombreVideos = nombreVideos;
    }

    public String getLinkVideos() {
        return linkVideos;
    }

    public void setLinkVideos(String linkVideos) {
        this.linkVideos = linkVideos;
    }

    public String getDescripcionVideos() {
        return descripcionVideos;
    }

    public void setDescripcionVideos(String descripcionVideos) {
        this.descripcionVideos = descripcionVideos;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}