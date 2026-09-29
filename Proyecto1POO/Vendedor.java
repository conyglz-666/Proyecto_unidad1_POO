package Proyecto1POO;

public class Vendedor extends Empleado{
    protected double com;

    public Vendedor(String nombre, double edad, double sueldoB, double com){
        super(nombre, edad, sueldoB);
        this.com = com;
    }
    

    @Override 
    public double CalcularSueldo(){
        return sueldoB + com;
    }
}
