package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numeroSilla;

    //ejecutivas = 0 | economicas = 1
    private int clase;

    //Ejecutiva :{ ventana = 0 | pasillo = 2 }
    //Economica :{ ventana = 0 | Centro = 1 | pasillo = 2 }
    private int ubicacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoavion", referencedColumnName = "codigoavion")
    private Avion avionSillas;

}
