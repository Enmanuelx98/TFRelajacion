package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Membresia;
import pe.edu.upc.tfcreo.entities.Role;
import pe.edu.upc.tfcreo.entities.Terapia;

import java.time.LocalDate;
import java.util.List;

public class UsuariosDTO {


    public Long idUsuarios;

    private String nombreUsuarios;

    private String apellidoUsuarios;

    private String correoUsuarios;

    private String contrasenaUsuarios;

    private LocalDate fechaNacimientoUsuarios;

    private Boolean activado;


    private List<Role> roles;

    private Membresia membresia;

    private Terapia terapia;

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
