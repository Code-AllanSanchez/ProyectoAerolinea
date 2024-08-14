package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sillas")
public class Silla {
    @Id
    @Column(name = "numerosilla")
    private int numeroSilla;

    private int clase;

    private int ubicacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoavion", referencedColumnName = "codigoavion")
    private Avion avionSillas;

}
