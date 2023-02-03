package ejerciciostema8;

public class EjerciciosTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Ariel");
        System.out.println("El nombre es:" + persona.getNombre());
        
        persona.setEdad(22);
        System.out.println("La edad es:" + persona.getEdad());
        
        persona.setTelefono(123456789);
        System.out.println("El telefono es:" + persona.getTelefono());
    }   
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;   
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
