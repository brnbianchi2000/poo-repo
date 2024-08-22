public class juego {
    public int cantidadVidas;

    public juego(int cantidadVidas) {
        this.cantidadVidas = cantidadVidas;
    }


    public int mostrarVidasRestantes(){
        return cantidadVidas;
    }
    public int restarVidas(){
        return this.cantidadVidas--;

    }

}
