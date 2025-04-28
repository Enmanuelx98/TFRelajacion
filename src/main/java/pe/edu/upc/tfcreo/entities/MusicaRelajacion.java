package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "musicaRelajacion")
public class MusicaRelajacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusicaRelajacion;

    @Column(name = "nombreMusicaRelajacion", length = 50, nullable = false)
    private String nombreMusicaRelajacion;
    @Column(name = "descripcionMusicaRelajacion", length = 200, nullable = false)
    private String descripcionMusicaRelajacion;
    @Column(name = "linkMusicaRelajacion", length = 500, nullable = false)
    private String linkMusicaRelajacion;

    @ManyToOne
    @JoinColumn(name = "idTerapia")
    private Terapia terapia;

    @ManyToOne
    @JoinColumn(name = "idPlaylist")
    private Playlist playlist;

    @ManyToOne
    @JoinColumn(name = "idMusicaCategoria")
    private MusicaCategoria musicaCategoria;

    public MusicaRelajacion() {
    }

    public MusicaRelajacion(int idMusicaRelajacion, String nombreMusicaRelajacion, String descripcionMusicaRelajacion, String linkMusicaRelajacion, Terapia terapia, Playlist playlist, MusicaCategoria musicaCategoria) {
        this.idMusicaRelajacion = idMusicaRelajacion;
        this.nombreMusicaRelajacion = nombreMusicaRelajacion;
        this.descripcionMusicaRelajacion = descripcionMusicaRelajacion;
        this.linkMusicaRelajacion = linkMusicaRelajacion;
        this.terapia = terapia;
        this.playlist = playlist;
        this.musicaCategoria = musicaCategoria;
    }

    public int getIdMusicaRelajacion() {
        return idMusicaRelajacion;
    }

    public void setIdMusicaRelajacion(int idMusicaRelajacion) {
        this.idMusicaRelajacion = idMusicaRelajacion;
    }

    public String getNombreMusicaRelajacion() {
        return nombreMusicaRelajacion;
    }

    public void setNombreMusicaRelajacion(String nombreMusicaRelajacion) {
        this.nombreMusicaRelajacion = nombreMusicaRelajacion;
    }

    public String getDescripcionMusicaRelajacion() {
        return descripcionMusicaRelajacion;
    }

    public void setDescripcionMusicaRelajacion(String descripcionMusicaRelajacion) {
        this.descripcionMusicaRelajacion = descripcionMusicaRelajacion;
    }

    public String getLinkMusicaRelajacion() {
        return linkMusicaRelajacion;
    }

    public void setLinkMusicaRelajacion(String linkMusicaRelajacion) {
        this.linkMusicaRelajacion = linkMusicaRelajacion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public MusicaCategoria getMusicaCategoria() {
        return musicaCategoria;
    }

    public void setMusicaCategoria(MusicaCategoria musicaCategoria) {
        this.musicaCategoria = musicaCategoria;
    }
}

