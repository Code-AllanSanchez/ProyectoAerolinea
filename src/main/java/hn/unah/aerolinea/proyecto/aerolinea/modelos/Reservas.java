package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "reservas")
public class Reservas {

    @Id
    @Column(name = "codigoreserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoReserva;

    private Date fecha;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "codigovuelo", referencedColumnName = "codigovuelo")
    private Vuelo codigoVuelo;

    @Column(name ="pasajeroid")
    private String pasajeroId;

    @Column(name = "cantidadsillas")
    private int cantidadSillas;

    
}
