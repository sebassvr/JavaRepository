// Loop for each    

public class Four_loop_for_each {
    public static void main(String[] args) {
        String[] nombres = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"};

        
        // Funcion .length para que se convierta en un int dependiendo del numero de elementos.
    /*    for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    */

    // Loop for each or loop for mejorado.

    for(String i:nombres){
        System.out.println(i);
    }

    }

}
