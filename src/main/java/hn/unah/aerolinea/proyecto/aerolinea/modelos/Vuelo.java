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
    @Column(name = "codigovuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoVuelo;

    private String origen;

    private String destino;

    @Column(name = "horasalida")
    private String horaSalida;

    @Column(name = "horallegada")
    private String horaLlegada;

    @Column(name = "fechasalida")
    private Date fechaSalida;

    @Column(name = "fecharegreso")
    private Date fechaRegreso;

    @Column(name ="estadovuelo")
    private String estadoVuelo;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoavion", referencedColumnName = "codigoavion")
    private Avion avion;

    
}
