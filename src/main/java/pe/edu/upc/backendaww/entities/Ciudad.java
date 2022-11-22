package pe.edu.upc.backendaww.entities;

import javax.persistence.*;

@Entity
@Table(name = "Ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCiudad;
    @Column(name = "nombreCiudad", length = 50, nullable = false)
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String nombreCiudad) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
