package org.example;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        if(largura <= 0 || altura <= 0){
            throw new IllegalArgumentException("Altura e largura devem ser maior que zero");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularArea() {
        return largura * altura;
    }
}
