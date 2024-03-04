import java.util.Scanner;

public class two_two_operators_arithmetic{
    /**
     * @param args
     */
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        float n1,n2,suma,resta,multiplicacion,division,resto;

        System.out.println("Digite 2 numeros: ");
        
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();

        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
        resto = n1 % n2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+resto);


        entrada.close();


    }





}