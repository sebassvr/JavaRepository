import java.util.Scanner;

/*  Exercise  5:
 *  La calificación final de un estudiante de Informática se calcula con base
 *  a las calificaciones de cuatro aspectos de su rendimiento académico: 
 *  participación, primer examen parcial, segundo examen parcial y examen final.
 *  Sabiendo que las calificaciones anteriores entran a la calificación final
 *  con ponderaciones del 10%, 25%, 25% y 40%.
 *  Hacer un programa que calcule e imprima la calificación final obtenida por
 *  un estudiante.
 * 
 */

public class two_nine_exercise_five_calculate_final_note_of_a_student{

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        float finalgrade, participation, firstexam, secondexam, finalexam;

        System.out.println("Program to calculate the final grade of a computer science student..");

        System.out.println("Enter your grade in participation: ");
        participation = x.nextFloat();
        System.out.println("Enter your grade in first exam: ");
        firstexam = x.nextFloat();
        System.out.println("Enter your grade in second exam: ");
        secondexam = x.nextFloat();
        System.out.println("Enter your grade in final exam: ");
        finalexam = x.nextFloat();

        // participation 10%
        participation *=0.10f;
        // first exam 25%
        firstexam *= 0.25f;
        //second exam 25%
        secondexam *= 0.25f;
        //final exam 40%
        finalexam *= 0.40f;

        // final result
        finalgrade = participation + firstexam + secondexam + finalexam;

        // print finalgrade
        System.out.println("The final grade is: "+finalgrade);
        System.out.println("\t\tEnd");


        x.close();
    }

}