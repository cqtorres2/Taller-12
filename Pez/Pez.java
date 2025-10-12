package Pez;
interface Respiracion {
    void Respirar();
}

interface Nadador {
    void Nadar();
}

public class Pez implements Nadador, Respiracion {

    @Override
    public void Respirar() {
        System.out.println("El pez respira el oxigeno en el agua");
    }

    @Override
    public void Nadar() {
        System.out.println("El pez nada apartando el agua a sus alrededores");
    }

}

class Main {
    public static void main(String[] args) {
        Pez pez = new Pez();
        pez.Nadar();
        pez.Respirar();
    }
}