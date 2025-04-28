package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idUsuarios;

    @Column(name = "nombreUsuarios", length = 50, nullable = false)
    private String nombreUsuarios;
    @Column(name = "apellidoUsuarios", length = 50, nullable = false)
    private String apellidoUsuarios;
    @Column(name = "correoUsuarios", length = 100, unique = true)
    private String correoUsuarios;
    @Column(name = "contrasenaUsuarios", length = 500, nullable = false)
    private String contrasenaUsuarios;
    @Column(name = "fechaNacimientoUsuarios", nullable = false)
    private LocalDate fechaNacimientoUsuarios;
    @Column(name = "activado", nullable = false)
    private Boolean activado;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarios_id")
    private List<Role> roles;

    @ManyToOne
    @JoinColumn(name = "idMembresia")
    private Membresia membresia;

    @ManyToOne
    @JoinColumn(name = "idTerapia")
    private Terapia terapia;

    public Usuarios() {
    }

    public Usuarios(Long idUsuarios, String nombreUsuarios, String apellidoUsuarios, String correoUsuarios, String contrasenaUsuarios, LocalDate fechaNacimientoUsuarios, Boolean activado, List<Role> roles, Membresia membresia, Terapia terapia) {
        this.idUsuarios = idUsuarios;
        this.nombreUsuarios = nombreUsuarios;
        this.apellidoUsuarios = apellidoUsuarios;
        this.correoUsuarios = correoUsuarios;
        this.contrasenaUsuarios = contrasenaUsuarios;
        this.fechaNacimientoUsuarios = fechaNacimientoUsuarios;
        this.activado = activado;
        this.roles = roles;
        this.membresia = membresia;
        this.terapia = terapia;
    }

    public Long getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Long idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombreUsuarios() {
        return nombreUsuarios;
    }

    public void setNombreUsuarios(String nombreUsuarios) {
        this.nombreUsuarios = nombreUsuarios;
    }

    public String getApellidoUsuarios() {
        return apellidoUsuarios;
    }

    public void setApellidoUsuarios(String apellidoUsuarios) {
        this.apellidoUsuarios = apellidoUsuarios;
    }

    public String getCorreoUsuarios() {
        return correoUsuarios;
    }

    public void setCorreoUsuarios(String correoUsuarios) {
        this.correoUsuarios = correoUsuarios;
    }

    public String getContrasenaUsuarios() {
        return contrasenaUsuarios;
    }

    public void setContrasenaUsuarios(String contrasenaUsuarios) {
        this.contrasenaUsuarios = contrasenaUsuarios;
    }

    public LocalDate getFechaNacimientoUsuarios() {
        return fechaNacimientoUsuarios;
    }

    public void setFechaNacimientoUsuarios(LocalDate fechaNacimientoUsuarios) {
        this.fechaNacimientoUsuarios = fechaNacimientoUsuarios;
    }

    public Boolean getActivado() {
        return activado;
    }

    public void setActivado(Boolean activado) {
        this.activado = activado;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
