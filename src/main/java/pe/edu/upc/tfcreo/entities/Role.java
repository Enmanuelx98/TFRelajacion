package pe.edu.upc.tfcreo.entities;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "usuarios_id", "rol" }) })
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    @ManyToOne
    @JoinColumn(name = "usuarios_id", nullable = false)
    private Usuarios usuarios;


    public Role() {
    }

    public Role(Long id, String rol, Usuarios usuarios) {
        this.id = id;
        this.rol = rol;
        this.usuarios = usuarios;
    }

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