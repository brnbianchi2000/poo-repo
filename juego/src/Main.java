public class Main {
    public static void main(String[] args) {
        juego jugador1=new juego(5);
        System.out.println("la cantidad de vidas restantes"+ jugador1.mostrarVidasRestantes());
        jugador1.restarVidas();

        System.out.println("la cantidad de vidas restantes"+ jugador1.mostrarVidasRestantes());

        juego jugador2=new juego(5);

        System.out.println("la cantidad de vidas del jugador2 "+ jugador2.mostrarVidasRestantes());
        System.out.println("la cantidad de vidas del jugador1 "+ jugador1.mostrarVidasRestantes());
        System.out.println("hola");
    }
}