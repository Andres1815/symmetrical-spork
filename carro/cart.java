package carro;
public class cart {
    
   public String marca;
   public String modelo;
   public String color;
   
   public cart(String marca, String modelo, String color){
   this.marca = marca;
   this.modelo = modelo;
   this.color = color;
   
   }
   public void arrancar(){
   System.out.print("El carro esta avansando");
   
   }
   public void parar(){
   System.out.println("El carro a parado");
   
   }
   public void cambiarColor(String nuevoColor){
   this.color = nuevoColor;
   System.out.println("El color a cambiado a: " + nuevoColor);
   }
   public static void main(String[] args){
   
   Carro miCoche1 = new Carro("Toyota", "corolla", "Azul");
   Carro miCoche2 = new Carro("Homda", "civic", "Rojo");
   
   miCoche1.arrancar();
   miCoche2.parar();
   
   miCoche1.cambiarColor("amarillo");
   miCoche2.cambiarColor("verde");
   }
   
   
}