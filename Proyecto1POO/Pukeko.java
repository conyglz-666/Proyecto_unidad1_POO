package Proyecto1POO;
    public class Pukeko extends Animal implements Volador {

    public Pukeko(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: DAMN!!!");
    }
    @Override
    public void volar() {
        System.out.println(nombre + " está volando por Nueva Zelanda");
    }
}

