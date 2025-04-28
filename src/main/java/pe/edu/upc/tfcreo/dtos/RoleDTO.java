package pe.edu.upc.tfcreo.dtos;

import pe.edu.upc.tfcreo.entities.Usuarios;

public class RoleDTO {

    private Long id;

    private String rol;

    private Usuarios usuarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
