package pe.edu.upc.tfcreo.dtos;


import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.entities.Playlist;
import pe.edu.upc.tfcreo.entities.Terapia;


public class MusicaRelajacionDTO {
    private int idMusica;
    private String nombreMusica;
    private String linkMusica;
    private String descripcionMusica;
    private Terapia terapia;
    private Playlist playlist;
    private MusicaCategoria musicaCategoria;

    public String getDescripcionMusica() {
        return descripcionMusica;
    }

    public void setDescripcionMusica(String descripcionMusica) {
        this.descripcionMusica = descripcionMusica;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getLinkMusica() {
        return linkMusica;
    }

    public void setLinkMusica(String linkMusica) {
        this.linkMusica = linkMusica;
    }

    public MusicaCategoria getMusicaCategoria() {
        return musicaCategoria;
    }

    public void setMusicaCategoria(MusicaCategoria musicaCategoria) {
        this.musicaCategoria = musicaCategoria;
    }

    public String getNombreMusica() {
        return nombreMusica;
    }

    public void setNombreMusica(String nombreMusica) {
        this.nombreMusica = nombreMusica;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
