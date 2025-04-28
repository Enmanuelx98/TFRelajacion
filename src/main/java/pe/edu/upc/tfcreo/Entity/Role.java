package pe.edu.upc.tfcreo.Entity;

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
    private Usuario usuario;


    public Role() {
    }

    public Role(Long id, String rol, Usuario usuarios) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuarios;
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

    public Usuario getUsuarios() {
        return usuario;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuario = usuarios;
    }
}
