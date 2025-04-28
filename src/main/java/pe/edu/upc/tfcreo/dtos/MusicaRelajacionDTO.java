package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.entities.Playlist;
import pe.edu.upc.tfcreo.entities.Terapia;

public class MusicaRelajacionDTO {


    private int idMusicaRelajacion;

    private String nombreMusicaRelajacion;

    private String descripcionMusicaRelajacion;

    private String linkMusicaRelajacion;

    private Terapia terapia;

    private Playlist playlist;

    private MusicaCategoria musicaCategoria;


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