/**
 *
 * @author sebassvr
 */

// Teoria y un poco de práctica que ya se hasta el capitulo 21
package inversordepalabras;

import java.util.Scanner;

public class EjemploUno {
    public static void main(String[] args) {
        // Forma 4:
        Scanner scanner = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase, nombre etc: ");
        frase = scanner.nextLine();
        
        char[] acumulador = new char[frase.length()];
        
        

        for (int i = frase.length()-1,j=0; i >= 0; i--, j++) {
            acumulador[j] = frase.charAt(i);
            System.out.print(acumulador[j]);
        }
        
        System.out.println("\n");

        
        
        
        
        // Forma 3:     
/*
        Scanner scanner = new Scanner(System.in);
        String frase;
        String acumulador = "";
        
        System.out.println("Ingrese una frase, nombre etc: ");
        frase = scanner.nextLine();
        
        for (int i = frase.length()-1; i >= 0; i--) {
            acumulador+= frase.charAt(i);
        }
        
        System.out.println(acumulador);
*/
        // Forma 2:
/*        
        Scanner scanner = new Scanner(System.in);
        String frase;
        String acumulador;
        
        System.out.println("Ingrese una frase, nombre etc: ");
        frase = scanner.nextLine();
        
        for (int i = frase.length() - 1; i >=0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("\n");
*/
        // Forma1:
/*
        Scanner scanner = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase, nombre etc: ");
        frase = scanner.nextLine();
        
        char[] arregloDeChars = frase.toCharArray();
        
        for (int i = arregloDeChars.length-1; i >= 0; i--) {
            System.out.print(arregloDeChars[i]); 
        }
        System.out.println("\n");
*/
    }
    
}
