package Proyecto1POO;

public abstract class Empleado {
    protected String nombre;
    protected double edad;
    protected double sueldoB;


    public Empleado(String nombre, double edad, double sueldoB){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoB = sueldoB;
    }

    public abstract double CalcularSueldo();
}
