package org.example.figuras;
//https://github.com/lelo441-pro/ParadigmasDeProgramacion
public class Circulo {
    private double x;
    private double y;
    private double radio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    public Circulo(double x) {
        this.x = x;
        this.y = 0;
        this.radio = 1;
    }

    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        this.radio = 1;
    }

    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public void moverX(double unidadesX) {
        this.x = this.x + unidadesX;
    }

    public void moverY(double unidadesY) {
        this.y = this.y + unidadesY;
    }

    public void moverXY(double unidadesX, double unidadesY) {
        this.x = this.x + unidadesX;
        this.y = this.y + unidadesY;
    }

    public void dibujar() {
        System.out.println("Me dibujo en la posicion X = " + this.x + " Y = " + this.y + " radio = " + this.radio);
    }
}
