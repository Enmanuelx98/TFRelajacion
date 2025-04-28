package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "imagenes")
public class Imagenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImagenes;

    @Column(name = "nombreImagenes", length = 100, nullable = false)
    private String nombreImagenes;
    @Column(name = "linkImagenes", length = 500, nullable = false)
    private String linkImagenes;
    @Column(name = "descripcionImagenes", length = 500)
    private String descripcionImagenes;

    @ManyToOne
    @JoinColumn(name = "idMaterial")
    private Material material;


    public Imagenes() {
    }

    public Imagenes(int idImagenes, String nombreImagenes, String linkImagenes, String descripcionImagenes, Material material) {
        this.idImagenes = idImagenes;
        this.nombreImagenes = nombreImagenes;
        this.linkImagenes = linkImagenes;
        this.descripcionImagenes = descripcionImagenes;
        this.material = material;
    }

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

