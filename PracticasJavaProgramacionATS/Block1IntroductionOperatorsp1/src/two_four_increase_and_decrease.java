public class two_four_increase_and_decrease{

    public static void main (String[] args){

        int x = 5, y=0;

        System.out.println(x);

        x++;

        System.out.println(x);

        y = --x; // primero hace el decremento y luego asigna.
        y = x++; // primero asigna y luego hace el decremento.

        System.out.println(y);

        System.out.println(x);

    }

}