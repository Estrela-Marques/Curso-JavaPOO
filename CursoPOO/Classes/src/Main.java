import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Puppy", "Marron", 25, 5.5, 5, "nada");
        Gato gato1 = new Gato("Mingau", "Branco", 15, 2.2, "nada");
        Passaro passaro1 = new Passaro("Salomé", "Amarela", 8, 0.5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}