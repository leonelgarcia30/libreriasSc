/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriascanner;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esta es mi lista de tareas:");
        String tarea1 = scanner.nextLine();
        System.out.println("1. Sacar el area del triangulo");
        String tarea2 = scanner.nextLine();
        System.out.println("2. Sacar el area del cuadrado");
        String tarea3 = scanner.nextLine();
        System.out.println("3. Sacar el area del rectangulo");
        String tarea4 = scanner.nextLine();
        System.out.println("4. Sacar el area del circulo");
        String tarea5 = scanner.nextLine();
        System.out.println("5. Terminar ejercicios");
        
      scanner.close();
    }
}
