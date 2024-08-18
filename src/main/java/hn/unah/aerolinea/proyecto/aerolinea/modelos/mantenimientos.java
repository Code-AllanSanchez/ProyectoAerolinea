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
@Table(name ="mantenimientos")
public class mantenimientos {

    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private Date fecha;

    private String operario;

    private String descripcion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="codigo", referencedColumnName = "codigoavion")
    private Avion avion;
    
}
