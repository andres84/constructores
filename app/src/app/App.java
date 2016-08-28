package app;

public class App {
    
    public static void main(String[] args) {
        
        movil movil = new movil("Samsung", "Dorado");
        movil.llamadaEspecial(movil);
        movil movil2 = new movil("LG", "Negro");
        movil2.llamar();
        
    }
    
}
