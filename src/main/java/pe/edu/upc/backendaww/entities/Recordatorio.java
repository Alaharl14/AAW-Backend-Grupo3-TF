package pe.edu.upc.backendaww.entities;

import javax.persistence.*;

@Entity
@Table(name = "Recordatorio")
public class Recordatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecordatorio;
    private Boolean estadoRecordatorio;

    public Recordatorio() {
    }

    public Recordatorio(int idRecordatorio, Boolean estadoRecordatorio) {
        this.idRecordatorio = idRecordatorio;
        this.estadoRecordatorio = estadoRecordatorio;
    }

    public int getIdRecordatorio() {
        return idRecordatorio;
    }

    public void setIdRecordatorio(int idRecordatorio) {
        this.idRecordatorio = idRecordatorio;
    }

    public Boolean getEstadoRecordatorio() {
        return estadoRecordatorio;
    }

    public void setEstadoRecordatorio(Boolean estadoRecordatorio) {
        this.estadoRecordatorio = estadoRecordatorio;
    }
}

