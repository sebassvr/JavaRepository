public class two_five_math_class {
    
    public static void main(String[] args){
        
        double numero = Math.random();

        System.out.println("El numero random es: "+numero);





        // Para redondear:   Math.round(numero);
        // Tenemos que guardar en una variable de tipo long en caso de ser double.
        // En caso de ser tipo float debemos guardar en una variable int.
        /*
        double numero = 4.56;

        long resultado = Math.round(numero);

        System.out.println("El resultado es redondeado es: "+resultado);
        */



        // Para elevar:      Math.pow(base , exponente);
        /*
        double base = 5, exponente = 5;

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de elevar 5 a la quinta es: "+resultado);
        */
    
    
        // Para sacar la raiz cuadrada:    Math.sqrt(numero);
        /* 
        double raiz = Math.sqrt(36.67);
    
        System.out.println("La raiz de cuadrada de 9: "+raiz);
        */

    }
}
