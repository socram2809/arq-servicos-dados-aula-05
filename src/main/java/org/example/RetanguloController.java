package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetanguloController {

    @GetMapping("/area")
    public int obterArea(@RequestParam int largura, @RequestParam int altura) {
        Retangulo retangulo = new Retangulo(largura, altura);
        return retangulo.calcularArea();
    }
}
