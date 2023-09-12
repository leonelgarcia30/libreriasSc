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
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner lecDat = new Scanner(System.in);
        System.out.println("Ingresar la base");
        int base = lecDat.nextInt();
        System.out.println("Ingresar la altura");
        int altura = lecDat.nextInt();
        
        int area = base*altura;
        
        System.out.println("El area es: " + area);
        
        lecDat.close();
                
    }

}
