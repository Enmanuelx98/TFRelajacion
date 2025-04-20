package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombreUsuario", nullable = false, length = 50)
    private String nombreUsuario;

    @Column(name = "correoUsuario", nullable = false, length = 50)
    private String correoUsuario;

    @Column(name = "fechaNacimientoUsuario", nullable = false)
    private LocalDate fechaNacimientoUsuario;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol;

    public Usuario(){}

    public Usuario(String correoUsuario, LocalDate fechaNacimientoUsuario, int idUsuario, String nombreUsuario, Rol rol) {
        this.correoUsuario = correoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public LocalDate getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
