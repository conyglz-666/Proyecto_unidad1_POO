import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Michi", 2));
        animales.add(new Perro("Luna", 7));

        System.out.println("El zoológico tiene " + animales.size() + " animales:\n");

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
        }
    }
}