package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Distrito")
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;
    @Column(name = "nombreDistrito", length = 50, nullable = false)
    private String nombreDistrito;

    @ManyToOne
    @JoinColumn(name = "idCiudad", nullable = false)
    private Ciudad ciudad;

    public Distrito() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Distrito(int idDistrito, String nombreDistrito, Ciudad ciudad) {
        this.idDistrito = idDistrito;
        this.nombreDistrito = nombreDistrito;
        this.ciudad = ciudad;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

