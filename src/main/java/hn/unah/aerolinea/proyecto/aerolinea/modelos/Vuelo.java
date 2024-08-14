package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import java.util.Date;

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
@Table(name = "vuelos")
public class Vuelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numerovuelo")
    private long numeroVuelo;

    private String horaSalida;

    private String horaLlegada;

    private Date fechaSalida;

    private Date fechaRegreso;

    private String origen;

    private String destino;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoavion", referencedColumnName = "codigoavion")
    private Avion avion;
    
}
