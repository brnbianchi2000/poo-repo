import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        juego jugador1=new juego(5);
        System.out.println("la cantidad de vidas restantes"+ jugador1.mostrarVidasRestantes());
        jugador1.restarVidas();



        juego jugador2=new juego(5);

        System.out.println("la cantidad de vidas del jugador1 "+ jugador1.mostrarVidasRestantes());
        System.out.println("la cantidad de vidas del jugador2 "+ jugador2.mostrarVidasRestantes());

        jugador2.quitaVida();
        jugador2.quitaVida();
        jugador2.quitaVida();
        jugador2.quitaVida();
        System.out.println("quita vidas jugador 2 "+ jugador2.mostrarVidasRestantes());

        jugador1.reiniciarPartida();
        System.out.println("la cantidad de vidas del jugador1 cuadno se reincia el juego "+ jugador1.mostrarVidasRestantes());
        //Añadir un método Quita Vida que disminuya en 1 el número de vidas del jugador y devuelva un boolean indicando si al jugador le quedan más vidas o no.
        // Utilizando el metodo anterior en el main mostrar por pantalla cuando al jugador no le queden mas vidas.
        //Añadir un método ReiniciaPartida que asigne al atributo vidas el número de vidas que se habían indicado al llamar al constructor del objeto. Para ello utilizará el nuevo atributo que se ha añadido.
    }
}