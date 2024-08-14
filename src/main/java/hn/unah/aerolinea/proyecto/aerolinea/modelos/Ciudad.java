package hn.unah.aerolinea.proyecto.aerolinea.modelos;

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
    private int codigoCiudad;

    private String nombreCiudad;

}
