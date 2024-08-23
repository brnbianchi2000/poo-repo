public class juego {
    private int vidasIniciales;
    public int cantidadVidas;

    public juego(int cantidadVidas) {
        this.cantidadVidas = cantidadVidas;
        this.vidasIniciales= cantidadVidas;
    }



    public int mostrarVidasRestantes(){
        return cantidadVidas;
    }
    public int restarVidas(){
        return this.cantidadVidas--;
    }
    public boolean quitaVida(){
        if (mostrarVidasRestantes()>0) {
            this.restarVidas();
        }
        return this.mostrarVidasRestantes()!=0;
    }
    public void reiniciarPartida(){
        this.cantidadVidas=vidasIniciales;
    }


}
