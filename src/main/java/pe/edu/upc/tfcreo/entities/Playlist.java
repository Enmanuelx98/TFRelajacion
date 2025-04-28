package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "playlists")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylist;
    @Column(name = "nombrePlaylist", length = 50, nullable = false)
    private String nombrePlaylist;


    public Playlist() {
    }

    public Playlist(int idPlaylist, String nombrePlaylist) {
        this.idPlaylist = idPlaylist;
        this.nombrePlaylist = nombrePlaylist;
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }
}