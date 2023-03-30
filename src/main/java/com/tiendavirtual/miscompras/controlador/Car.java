package com.tiendavirtual.miscompras.controlador;

import com.tiendavirtual.miscompras.dto.Cardto;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/api")
public class Car {

    @GetMapping("/car")
    public String obtenercarros() {
        return "obtener carro";

    }

    @PostMapping("/car")
    public void crearcarro(@RequestBody Cardto cardto) {
        System.out.println("crear carro");
    }

    @DeleteMapping("/car")
    public void eliminarcarro(@RequestParam int id ) {
        System.out.println("eliminar carro");

    }

    @PutMapping("/car")
    public void modificarcarro(@RequestBody Cardto cardto){
        System.out.println("modificar carro");

    }
}

