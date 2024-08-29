package org.example.lab2_20203644.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.example.lab2_20203644.Controller.Palabra;
import java.lang.*;
import java.util.ArrayList;

@Controller
public class DemoControl {
    @GetMapping(value = "/formulario")
    public String formularioconfiguracion(){

        return "formularioconf";
    }

    @PostMapping(value = "/guardar")
    public String formularioconfiguracion(@RequestParam("longitud") Integer longitudPalabra,@RequestParam("intentos") Integer intentosPalabra,
                                          @RequestParam("tema") String temaPalabra){
        System.out.println("longitud:" + longitudPalabra + "\n" +
                "intentos: " + intentosPalabra + "\n" +
                "tema:" +temaPalabra);
        return "guardar";
    }

    @GetMapping(value ="/juego")
    public String juegoahorcado (){

        return "juego";
    }

    public String adivinanza (Palabra palabra){
        Palabra palabra1 = new Palabra();
        ArrayList<Palabra> listaPalabras = new ArrayList<>();
        if (listaPalabras.get(length(listaPalabras)==6)){
            
        }





    }

}
