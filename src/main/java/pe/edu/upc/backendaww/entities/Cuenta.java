package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cuenta")
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    @Column(name = "nombreCuenta", length = 40, nullable = false)
    private String nombreCuenta;
    @Column(name = "contrasenaCuenta", length = 24, nullable = false)
    private String contrasenaCuenta;
    @Column(name = "correoCuenta", length = 100, nullable = false)
    private String correoCuenta;
    @Column(name = "numeroCuenta", length = 20, nullable = false)
    private String numeroCuenta;
    @Column(name = "direccionCuenta", length = 120, nullable = false)
    private String direccionCuenta;

    @ManyToOne
    @JoinColumn(name = "idDistrito", nullable = false)
    private Distrito distrito;

    public Cuenta() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Cuenta(int idCuenta, String nombreCuenta, String contrasenaCuenta, String correoCuenta, String numeroCuenta, String direccionCuenta, Distrito distrito) {
        this.idCuenta = idCuenta;
        this.nombreCuenta = nombreCuenta;
        this.contrasenaCuenta = contrasenaCuenta;
        this.correoCuenta = correoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.direccionCuenta = direccionCuenta;
        this.distrito = distrito;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getContrasenaCuenta() {
        return contrasenaCuenta;
    }

    public void setContrasenaCuenta(String contrasenaCuenta) {
        this.contrasenaCuenta = contrasenaCuenta;
    }

    public String getCorreoCuenta() {
        return correoCuenta;
    }

    public void setCorreoCuenta(String correoCuenta) {
        this.correoCuenta = correoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDireccionCuenta() {
        return direccionCuenta;
    }

    public void setDireccionCuenta(String direccionCuenta) {
        this.direccionCuenta = direccionCuenta;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
