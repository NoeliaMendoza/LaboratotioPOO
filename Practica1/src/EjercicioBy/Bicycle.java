package EjercicioBy;

import java.util.Scanner;
//Clase
public class Bicycle {
    
    //Definición de atributos
    String color;
    int velocity;
    int bicyclePlat;
    int bicycleSprocket;
    
    //Método Constructor
    private Bicycle(String color, int velocity, int bicyclePlat, int bicycleSprocket) {
    	this.color = color;
        this.velocity = velocity;
        this.bicyclePlat = bicyclePlat;
        this.bicycleSprocket = bicycleSprocket;
    }
    public String getColor() {
    	return color;
    }
    public int getVelocity() {
        return velocity;
    }
    
    public int getBicyclePlat() {
        return bicyclePlat;
    }
    
    public int getBicycleSprocket() {
        return bicycleSprocket;
    }
    
    //Metodos
    //acelerar
    public void accelerate() {
        System.out.println("La velocidad actual de mi bicicleta es "+velocity+" km/h");
        
    }
    //Frenar
    public void brake() {
        // Suponiendo que al frenar la velocidad se reduce a la mitad
        velocity /= 2;
        System.out.println("La velocidad de mi bicicleta al frenar será de "+velocity+" km/h");
        
    }
    //Cambio de Platos
    public void changeChainring(int newChainring) {
        this.bicyclePlat = newChainring;
        System.out.println("Se ha cambiado el plato de la bicicleta a "+bicyclePlat);
        
    }
    //Cambio de piñon
    public void changeSprocket(int newSprocket) {
        this.bicycleSprocket = newSprocket;
        System.out.println("Se ha cambiado el piñón de la bicicleta a "+bicycleSprocket);
        
    }
    
    public static void main (String [] arg) {
    	
    	try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Ingrese el color de la bicicleta ");
			String color = entrada.nextLine();
			
			System.out.print("Ingrese la velocidad inicial de la bicicleta en km/h: ");
			int velocity = entrada.nextInt();
			
			System.out.print("Ingrese el plato actual de la bicicleta: ");
			int bicyclePlat = entrada.nextInt();
			
			System.out.print("Ingrese el piñón actual de la bicicleta: ");
			int bicycleSprocket = entrada.nextInt();
			
			Bicycle miBicicleta1 = new Bicycle(color , velocity, bicyclePlat, bicycleSprocket);
			
			// Imprimir los datos de la bicicleta
			System.out.println("----------------------------------------------------------- ");
			System.out.println("Color de la bicicleta: " + miBicicleta1.getColor());
			System.out.println("Velocidad de la bicicleta: " + miBicicleta1.getVelocity() + " km/h");
			System.out.println("Plato actual de la bicicleta: " + miBicicleta1.getBicyclePlat());
			System.out.println("Piñón actual de la bicicleta: " + miBicicleta1.getBicycleSprocket());
			System.out.println("----------------------------------------------------------- ");
		}
    }
}