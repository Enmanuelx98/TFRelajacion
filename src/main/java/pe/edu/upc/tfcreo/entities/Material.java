package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterial;

    @Column(name = "nombreMaterial", length = 100, nullable = false)
    private String nombreMaterial;
    @Column(name = "descripcionMaterial", length = 500)
    private String descripcionMaterial;

    @ManyToOne
    @JoinColumn(name = "idTecnicaMeditacion")
    private TecnicaMeditacion tecnicaMeditacion;

    public Material() {
    }

    public Material(int idMaterial, String nombreMaterial, String descripcionMaterial, TecnicaMeditacion tecnicaMeditacion) {
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.descripcionMaterial = descripcionMaterial;
        this.tecnicaMeditacion = tecnicaMeditacion;
    }

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
