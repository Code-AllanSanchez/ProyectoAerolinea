package hn.unah.aerolinea.proyecto.aerolinea.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="pasajeros")
public class Pasajeros {

    @Id
    @Column(name ="id")
    private String id;

    private String nombre;

    private String apellido;

    @OneToOne
    @JoinColumn(name ="silla", referencedColumnName = "numerosilla")
    private Silla silla;
    
}
