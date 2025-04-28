package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class Videos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideos;

    @Column(name = "nombreVideos", length = 100, nullable = false)
    private String nombreVideos;
    @Column(name = "linkVideos", length = 500, nullable = false)
    private String linkVideos;
    @Column(name = "descripcionVideos", length = 500, nullable = false)
    private String descripcionVideos;

    @ManyToOne
    @JoinColumn(name = "idMaterial")
    private Material material;

    public Videos() {
    }

    public Videos(int idVideos, String nombreVideos, String linkVideos, String descripcionVideos, Material material) {
        this.idVideos = idVideos;
        this.nombreVideos = nombreVideos;
        this.linkVideos = linkVideos;
        this.descripcionVideos = descripcionVideos;
        this.material = material;
    }

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