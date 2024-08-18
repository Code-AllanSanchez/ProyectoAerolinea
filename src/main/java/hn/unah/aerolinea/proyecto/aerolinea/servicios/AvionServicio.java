package hn.unah.aerolinea.proyecto.aerolinea.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Avion;
import hn.unah.aerolinea.proyecto.aerolinea.modelos.Silla;
import hn.unah.aerolinea.proyecto.aerolinea.modelos.Vuelo;
import hn.unah.aerolinea.proyecto.aerolinea.modelos.mantenimientos;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.AvionRepositorio;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.MantenimientosRepositorio;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.SillaRepositorio;

@Service
public class AvionServicio {
    
    @Autowired
    private AvionRepositorio avionRepositorio;

    @Autowired
    private SillaRepositorio sillaRepositorio;

    @Autowired
    private MantenimientosRepositorio mantenimientosR;

    public Avion nuevoAvion(Avion nuevoAvion){
        if (this.avionRepositorio.existsById(nuevoAvion.getCodigoAvion())){
            return null;
        }
        
        List<Vuelo> vuelos = nuevoAvion.getVuelos();
        if(vuelos != null){
            for (Vuelo v : vuelos){
                v.setAvion(nuevoAvion);
            }
        }

        List<Silla> listaSillas = crearSillas();
        for (Silla s : listaSillas) {
            s.setAvionSillas(nuevoAvion);
            this.sillaRepositorio.save(s);
        }

        return this.avionRepositorio.save(nuevoAvion);
    }

    public List<Silla> crearSillas(){
        List<Silla> listaSillas = new ArrayList<>();
        
        for(int numSilla = 1; numSilla<=42; numSilla++){
            Silla nuevaSilla = new Silla();
            if (numSilla <=8){
                nuevaSilla.setClase(0);

                if (numSilla % 4 == 1 || numSilla % 4 == 0) {
                    nuevaSilla.setUbicacion(0);
                }else{
                    nuevaSilla.setUbicacion(2);
                }
                
                listaSillas.add(nuevaSilla);

            }else{
                nuevaSilla.setClase(1);

                if (numSilla % 6 == 1 || numSilla % 6 == 0){
                    nuevaSilla.setUbicacion(0);
                }else if(numSilla % 6 == 2 || numSilla % 6 == 5){
                    nuevaSilla.setUbicacion(1);
                }else{
                    nuevaSilla.setUbicacion(2);
                }
                listaSillas.add(nuevaSilla);
            }

        }

        return listaSillas;
    }

    public void asignarVuelo(){
        
    }

    public List<mantenimientos> obtenerMantenimientos(){
        return this.mantenimientosR.findAll();

    }

}
