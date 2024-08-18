package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @Column(name = "codigociudad")
    private long codigoCiudad;

    @Column(name = "nombreciudad")
    private String nombreCiudad;

    
    private List<Vuelo> vuelos;

}
