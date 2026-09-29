package Proyecto1POO;

public class Cilculo extends FiguraGeometrica{//extend para heredar, babosa
    private double radio;

    public Cilculo(double radio){
        this.radio = radio;
    }

    @Override
    public double CalcularArea(){
        return Math.PI * radio * radio;
    }



}
