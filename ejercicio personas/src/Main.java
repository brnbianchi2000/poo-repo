public class Main {
    public static void main(String[] args) {
        personas pablo= new personas();
        pablo.darNombre("pablo Hernandez");
        System.out.println(pablo.saludar());
        System.out.println("pablo tiene " + pablo.decirEdad()+ "años de edad");

        for (int i=0;i<25; i++){
            pablo.cumplirAnios();
        }
        System.out.println("pablo tiene " + pablo.decirEdad()+ "años de edad");
        System.out.println("holaaaa");
        pablo.caminar();
    }
}

