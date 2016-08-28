
package app;


public class movil {
    
    
    String nombre;
    String color;
    
    public movil(String nombre, String color){
        
        this.nombre = nombre;
        this.color = color;
        
    }
    
    public void llamar(){
        
        System.out.println(nombre + "-" + color + " esta llamando...");
        
    }
    
    public void llamadaEspecial(movil m){
        
        System.out.println(m.nombre + "-" + m.color + " iniciando llamada internacional...");
        
    }
    
    
}
