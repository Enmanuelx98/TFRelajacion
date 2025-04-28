package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "documentos")
public class Documentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocumentos;

    @Column(name = "nombreDocumentos", length = 100, nullable = false)
    private String nombreDocumentos;
    @Column(name = "linkDocumentos", length = 500, nullable = false)
    private String linkDocumentos;
    @Column(name = "descripcionDocumentos", length = 500)
    private String descripcionDocumentos;


    @ManyToOne
    @JoinColumn(name = "idMaterial")
    private Material material;


    public Documentos() {
    }

    public Documentos(int idDocumentos, String nombreDocumentos, String linkDocumentos, String descripcionDocumentos, Material material) {
        this.idDocumentos = idDocumentos;
        this.nombreDocumentos = nombreDocumentos;
        this.linkDocumentos = linkDocumentos;
        this.descripcionDocumentos = descripcionDocumentos;
        this.material = material;
    }

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

