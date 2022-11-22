package pe.edu.upc.backendaww.entities;

import javax.persistence.*;

@Entity
@Table(name="CategoriaObjeto")
public class CategoriaObjeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoriaObjeto;
    @Column(name="nombreCategoriaObjeto",length = 50,nullable = false)
    private String nombreCategoriaObjeto;
    public CategoriaObjeto() {
    }

    public CategoriaObjeto(int idCategoriaObjeto, String nombreCategoriaObjeto) {
        this.idCategoriaObjeto = idCategoriaObjeto;
        this.nombreCategoriaObjeto = nombreCategoriaObjeto;
    }

    public int getIdCategoriaObjeto() {
        return idCategoriaObjeto;
    }

    public void setIdCategoriaObjeto(int idCategoriaObjeto) {
        this.idCategoriaObjeto = idCategoriaObjeto;
    }

    public String getNombreCategoriaObjeto() {
        return nombreCategoriaObjeto;
    }

    public void setNombreCategoriaObjeto(String nombreCategoriaObjeto) {
        this.nombreCategoriaObjeto = nombreCategoriaObjeto;
    }
}
