package app_refugio;
import app_refugio.modelo.TipoCasa;
import app_refugio.otro.PruebaEnum;

import java.time.LocalDate;

import app_refugio.modelo.Adoptante;
import app_refugio.modelo.Evaluable;
import app_refugio.modelo.Persona;
import app_refugio.modelo.Vacuna;
import app_refugio.modelo.CartillaSalud;

public class App {
    public static void main(String[] args) throws Exception {
       /*

        TipoCasa micasa=TipoCasa.DEPARTAMENTO;
        Adoptante candidato=new Adoptante();

        candidato.setNombre("Juanito");
        candidato.setCURP("HRSD950523HDFTRE23");
        candidato.setIngresoMensual(80);
        candidato.setTipoCasa(TipoCasa.PALOMAR);
         */

        //PruebaEnum.prueba();

        
    Vacuna v=new Vacuna(1,"Rabia", LocalDate.now(),546545);

    CartillaSalud cartilla=new CartillaSalud();
    
    cartilla.agregarVacuna(v);
    


    
    }//main

}

