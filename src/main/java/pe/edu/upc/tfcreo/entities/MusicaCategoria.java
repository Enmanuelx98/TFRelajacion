package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "musicaCategoria")
public class MusicaCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusicaCategoria;

    @Column(name = "nombreMusicaCategoria", length = 50, unique = true)
    private String nombreMusicaCategoria;

    public MusicaCategoria() {
    }

    public MusicaCategoria(String nombreMusicaCategoria, int idMusicaCategoria) {
        this.nombreMusicaCategoria = nombreMusicaCategoria;
        this.idMusicaCategoria = idMusicaCategoria;
    }

    public int getIdMusicaCategoria() {
        return idMusicaCategoria;
    }

    public void setIdMusicaCategoria(int idMusicaCategoria) {
        this.idMusicaCategoria = idMusicaCategoria;
    }

    public String getNombreMusicaCategoria() {
        return nombreMusicaCategoria;
    }

    public void setNombreMusicaCategoria(String nombreMusicaCategoria) {
        this.nombreMusicaCategoria = nombreMusicaCategoria;
    }
}
