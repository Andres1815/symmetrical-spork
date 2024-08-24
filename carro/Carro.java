package carro;
public class Carro {
    // Propiedades
    private String marca;
    private String modelo;
    private String color;
// Constructor (para inicializar las propiedades)
    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
  // Métodos
    public void arrancar() {
        System.out.println("El carro está arrancando...");
    }
public void parar() {
        System.out.println("El carro se detuvo.");
    }
  // Método adicional: Cambiar el color del coche
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Color cambiado a: " + nuevoColor);
    }
 // Método principal (punto de entrada)
    public static void main(String[] args) {
        // Creación de dos objetos "miCoche1" y "miCoche2"
        Carro miCoche1 = new Carro("Toyota", "Corolla", "Azul");
        Carro miCoche2 = new Carro("Honda", "Civic", "Rojo");
// Llamada a métodos
        miCoche1.arrancar();
        miCoche2.parar();
                
 // Cambio de color
        miCoche1.cambiarColor("Verde");
        miCoche2.cambiarColor("Amarillo");
    }
}
