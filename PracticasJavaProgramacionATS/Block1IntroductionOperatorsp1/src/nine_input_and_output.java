import java.util.Scanner;

public class nine_input_and_output{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.println("Digite una cadena: ");
        letra = entrada.next().charAt(0); // Usamos next().charAt(y aqui va el index del char que queramos guardar);
        System.out.println("La letra es: "+letra);
    
    
        entrada.close();
    /*   
        Scanner entrada = new Scanner(System.in);
        String cadena;

        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine(); // Si es un palabra solo .next y si es varias palabras se usa .nextline
        System.out.println("El cadena es: "+cadena);
    */
    
    
    /*    
        Scanner entrada = new Scanner(System.in);
        float numero;

        System.out.println("Digite un numero: ");
        numero = entrada.nextFloat();    // variable.next.tipodedato();
        System.out.println("El numero es: "+numero);
    */
    
    }

}