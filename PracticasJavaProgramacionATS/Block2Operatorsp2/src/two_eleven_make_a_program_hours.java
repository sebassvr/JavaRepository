import java.util.Scanner;


public class two_eleven_make_a_program_hours {

	public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int weeks, days, hours, data;

        System.out.println("Initializing");
        System.out.println("Enter the number of hours: ");
        data = x.nextInt();

        weeks = data/168;
        days = data%168/24;
        hours = data%24;

        System.out.print("There are "+weeks);
        System.out.print(" weeks and "+days);
        System.out.print(" days with "+hours);
        System.out.print(" hours.");

        x.close();
	}

}
