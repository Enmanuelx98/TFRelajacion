package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Users;

public class RoleDTO {
    private int id;
    private String rol;
    private Users user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
