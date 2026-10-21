package org.example;

import org.example.figuras.Circulo;

//https://github.com/lelo441-pro/ParadigmasDeProgramacion
public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(3, 4);
        Circulo circulo3 = new Circulo(-2, 5, 4.5);

        System.out.println("--- Posicion inicial ---");
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();

        System.out.println("\n--- Area y perimetro ---");
        System.out.println("Circulo 1: area = " + circulo1.calcularArea() + ", perimetro = " + circulo1.calcularPerimetro());
        System.out.println("Circulo 2: area = " + circulo2.calcularArea() + ", perimetro = " + circulo2.calcularPerimetro());
        System.out.println("Circulo 3: area = " + circulo3.calcularArea() + ", perimetro = " + circulo3.calcularPerimetro());

        circulo1.moverX(5);
        circulo2.moverY(-2);
        circulo3.moverXY(1, 1);

        System.out.println("\n--- Despues de moverlos ---");
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();
    }
}