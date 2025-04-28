package pe.edu.upc.tfcreo.securities;

import java.io.Serializable;

public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String correoUsuarios;
    private String contrasenaUsuarios;
    public JwtRequest() {
        super();
        // TODO Auto-generated constructor stub
    }
    public JwtRequest(String correoUsuarios, String contrasenaUsuarios) {
        super();
        this.correoUsuarios = correoUsuarios;
        this.contrasenaUsuarios = contrasenaUsuarios;
    }
    public static long getSerialversionuid() {return serialVersionUID;}
    public String getCorreoUsuarios() {
        return correoUsuarios;
    }
    public String getContrasenaUsuarios() {
        return contrasenaUsuarios;
    }
    public void setCorreoUsuarios(String correoUsuarios) {
        this.correoUsuarios = correoUsuarios;
    }
    public void setContrasenaUsuarios(String contrasenaUsuarios) {
        this.contrasenaUsuarios = contrasenaUsuarios;
    }
}

