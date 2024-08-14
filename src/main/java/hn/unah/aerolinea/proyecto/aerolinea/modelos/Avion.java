package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "aviones")
public class Avion {

    @Id
    @Column(name = "codigoavion")
    private String codigoAvion;

    private int numeroAsientos;

    @OneToMany(mappedBy = "avionSillas", cascade = CascadeType.ALL)
    private List<Silla> sillas;

    @OneToMany(mappedBy = "avion", cascade = CascadeType.ALL)
    private List<Vuelo> vuelos;
    
    
}
