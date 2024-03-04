/* Block Cycles or loops
 *  Exercise 5.
 *  Realizar un juego para adivinar un número aleatorio entre 0 - 100, y luego
 *  ir pidiendo números indicando "Es mayor" o "Es menor" según sea mayor o
 *  menor con respecto a N. El proceso términa cuando el usuario acierta y 
 *  mostrar el número de intentos.
 */

import java.util.Scanner;


public class nine_random_game {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int counter=0, num, random;

        random = (int)(Math.random()*100);
        System.out.println(random);


        System.out.println("\tRANDOM GAME");
        do{
            System.out.println("\nAttempt"+(counter+1)+" .Enter a number beetween 0 - 100");
            num = x.nextInt();

            if(num != random){
                counter++;
                System.out.println("Attempt counter +1 = "+counter);
            }

            if(num < random){
                System.out.println("The number is greater");
            }
            else if(num > random){
                System.out.println("The number is less");
            }

        }while(num != random);

        System.out.println("End, you won with "+counter+" tries");








        x.close();
    }

}
