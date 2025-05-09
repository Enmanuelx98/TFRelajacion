package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(length = 30, unique = true)
    private String username;

    @Column(length = 200)
    private String password;

    private Boolean enabled;

    @Column(name = "nombreUsuario", nullable = false, length = 50)
    private String nombreUsuario;

    @Column(name = "correoUsuario", nullable = false, length = 50)
    private String correoUsuario;

    @Column(name = "fechaNacimientoUsuario", nullable = false)
    private LocalDate fechaNacimientoUsuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Rol> rol;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, Boolean enabled, String nombreUsuario, String correoUsuario, LocalDate fechaNacimientoUsuario, List<Rol> rol) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public List<Rol> getRol() {
        return rol;
    }

    public void setRol(List<Rol> rol) {
        this.rol = rol;
    }
}
