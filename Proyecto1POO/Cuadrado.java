package Proyecto1POO;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override 
    public double CalcularArea(){
        return lado * lado;
    }
}
