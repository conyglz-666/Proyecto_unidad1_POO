package Proyecto1POO;

public class Gerente extends Empleado {
    public static double bono = 6700;//static de que le pertenece a la clase y final de que es fija la cantidad

    public Gerente(String nombre, double edad, double sueldoB){
        super(nombre, edad, sueldoB);
    }

    public static double getBono() {
        return bono;
    }
    
    @Override 
    public double CalcularSueldo(){
        return sueldoB + bono;
    }
    
}
