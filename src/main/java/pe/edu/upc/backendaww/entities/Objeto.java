package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "Objeto")
public class Objeto implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObjeto;
    @Column(name = "nombreObjeto", length = 100, nullable = false)
    private String nombreObjeto;
    @Column(name = "distancia", length = 20, nullable = false)
    private String distancia;
    @Column(name = "distanciaLimite", length = 20, nullable = false)
    private String distanciaLimite;
    @Column(name = "ubicacion", length = 100, nullable = false)
    private String ubicacion;
    @Column(name = "fechaRegistrado")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaRegistrado;

    @ManyToOne
    @JoinColumn(name = "idCuenta", nullable = false)
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "idRecordatorio", nullable = false)
    private Recordatorio recordatorio;

    @ManyToOne
    @JoinColumn(name = "idCategoriaObjeto", nullable = false)
    private CategoriaObjeto categoriaObjeto;

    @ManyToOne
    @JoinColumn(name = "idEstadoObjeto", nullable = false)
    private EstadoObjeto estadoObjeto;


    public Objeto(int idObjeto, String nombreObjeto, String distancia, String distanciaLimite, String ubicacion, LocalDate fechaRegistrado, Cuenta cuenta, Recordatorio recordatorio, CategoriaObjeto categoriaObjeto, EstadoObjeto estadoObjeto) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.distancia = distancia;
        this.distanciaLimite = distanciaLimite;
        this.ubicacion = ubicacion;
        this.fechaRegistrado = fechaRegistrado;
        this.cuenta = cuenta;
        this.recordatorio = recordatorio;
        this.categoriaObjeto = categoriaObjeto;
        this.estadoObjeto = estadoObjeto;
    }

    public Objeto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDistanciaLimite() {
        return distanciaLimite;
    }

    public void setDistanciaLimite(String distanciaLimite) {
        this.distanciaLimite = distanciaLimite;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFechaRegistrado() {
        return fechaRegistrado;
    }

    public void setFechaRegistrado(LocalDate fechaRegistrado) {
        this.fechaRegistrado = fechaRegistrado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Recordatorio getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }

    public CategoriaObjeto getCategoriaObjeto() {
        return categoriaObjeto;
    }

    public void setCategoriaObjeto(CategoriaObjeto categoriaObjeto) {
        this.categoriaObjeto = categoriaObjeto;
    }

    public EstadoObjeto getEstadoObjeto() {
        return estadoObjeto;
    }

    public void setEstadoObjeto(EstadoObjeto estadoObjeto) {
        this.estadoObjeto = estadoObjeto;
    }
}
