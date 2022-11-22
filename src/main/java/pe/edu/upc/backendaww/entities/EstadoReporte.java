package pe.edu.upc.backendaww.entities;

import javax.persistence.*;


@Entity
@Table(name = "EstadoReporte")
public class EstadoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadoReporte;
    @Column(name = "nombreEstadoReporte", length = 50, nullable = false)
    private String nombreEstadoReporte;
    public EstadoReporte() {
    }

    public EstadoReporte(int idEstadoReporte, String nombreEstadoReporte) {
        this.idEstadoReporte = idEstadoReporte;
        this.nombreEstadoReporte = nombreEstadoReporte;
    }

    public int getIdEstadoReporte() {
        return idEstadoReporte;
    }

    public void setIdEstadoReporte(int idEstadoReporte) {
        this.idEstadoReporte = idEstadoReporte;
    }

    public String getNombreEstadoReporte() {
        return nombreEstadoReporte;
    }

    public void setNombreEstadoReporte(String nombreEstadoReporte) {
        this.nombreEstadoReporte = nombreEstadoReporte;
    }
}
