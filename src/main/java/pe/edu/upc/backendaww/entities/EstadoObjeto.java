package pe.edu.upc.backendaww.entities;

import javax.persistence.*;

@Entity
@Table(name = "EstadoObjeto")
public class EstadoObjeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadoObjeto;
    @Column(name = "nombreEstadoObjeto", length = 50, nullable = false)
    private String nombreEstadoObjeto;

    public EstadoObjeto() {
    }

    public EstadoObjeto(int idEstadoObjeto, String nombreEstadoObjeto) {
        this.idEstadoObjeto = idEstadoObjeto;
        this.nombreEstadoObjeto = nombreEstadoObjeto;
    }

    public int getIdEstadoObjeto() {
        return idEstadoObjeto;
    }

    public void setIdEstadoObjeto(int idEstadoObjeto) {
        this.idEstadoObjeto = idEstadoObjeto;
    }

    public String getNombreEstadoObjeto() {
        return nombreEstadoObjeto;
    }

    public void setNombreEstadoObjeto(String nombreEstadoObjeto) {
        this.nombreEstadoObjeto = nombreEstadoObjeto;
    }
}
