package Ave;
interface Volador {
    void Volar();
}

interface Cantante {
    void Cantar();
}

public class Ave implements Cantante, Volador {

    @Override
    public void Volar() {
        System.out.println("El ave vuela a una velocidad de 45 K/H");
    }

    @Override
    public void Cantar() {
        System.out.println("El canto del ave tiene el proposito de buscar pareja");
    }

}

class Main {
    public static void main(String[] args) {
            Ave ave = new Ave();
            ave.Cantar();
            ave.Volar();
    }

}
