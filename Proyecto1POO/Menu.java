package Proyecto1POO; //siempre va primero, q no se te olvide
import java.util.ArrayList;

public class Menu {
    public static void main (String[] args){
        ArrayList <FiguraGeometrica> figuras = new ArrayList<>();//array figuras
        

        figuras.add(new Cuadrado(10));
        figuras.add(new Cilculo(12));
        figuras.add(new Cuadrado(8));
        figuras.add(new Cilculo(6));
        figuras.add(new Cuadrado(14));

        ArrayList<Animal> animales = new ArrayList<>();//Array animales

        animales.add(new Gato("Sixe", 6));
        animales.add(new Perro("Bluey", 7));
        animales.add(new Pukeko("Pukeberto", 8));

        ArrayList<Empleado> empleados = new ArrayList<>();//array empleados (gerentes y vendedor)
        empleados.add(new Vendedor("Pukeko Aguilar", 67, 20000, 5700 ));
        empleados.add(new Vendedor("Maluma Beibi", 26, 20000, 12000 ));
        empleados.add(new Gerente("Sixevenaldo Larios", 35, 35000));
        
        double SumaT = 0;
        for(FiguraGeometrica f : figuras){
            SumaT += f.CalcularArea();
        }

        Empleado empleadoM =empleados.get(0);
        for(Empleado e : empleados){
            if(e.CalcularSueldo() > empleadoM.CalcularSueldo()){
                empleadoM = e; 
            }
        }
        System.out.println("------------ FIGURAS GEOMETRICAS ------------");
        System.out.println("\n");
        System.out.println("La suma de todo es: "+ SumaT);
        System.out.println("Tenemos " + figuras.size() + " figuras.\n");
        System.out.println("\n");
        System.out.println("------------ TEMU ------------");
        System.out.println("\n");
        System.out.println("El mayor salario es de " + empleadoM.CalcularSueldo());
        System.out.println("\n");
        System.out.println("------------ UTMA ------------");
        System.out.println("\n");
        System.out.println("La UTMA tiene " + animales.size() + " animales.\n");
        System.out.println("\n");
        for (Animal a : animales) {
            System.out.println(a);          // usa el toString de Animal
            a.comer();                    // heredado, igual para todos
            a.hacerSonido();              // polimorfismo: cada uno responde distinto

            // Solo si además sabe nadar
            if (a instanceof Nadador) {
                Nadador n = (Nadador) a;
                n.nadar();
            }
            System.out.println();
            if (a instanceof Volador) {
                Volador n = (Volador) a;
                n.volar();
            }
            System.out.println();
        }
        
    }
}
