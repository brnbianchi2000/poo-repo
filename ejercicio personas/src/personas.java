public class personas {
    private String nombre;
    private int edad;

    public void darNombre(String nombre) {
        this.nombre = nombre;
    }
    public void  cumplirAnios(){
        //this.edad=this.edad+=1
        this.edad++;
        /*metodo polimorfico para aumentar*/
    }
    public String saludar(){
        return "hola soy "+ this.nombre;
    }
    public int decirEdad(){
        return this.edad;
    }
    public void caminar(){
        // sout
        System.out.println("estoy caminando");//ya vamos a ver que esto esta a mal porque estamos acoplando
    }
}
