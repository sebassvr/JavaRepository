package PruebasExcepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//  Excepciones Personalizadas.
//  Un ejemplo, hacer un excepción personalizada donde si el usuario ingresa 0, ocurre una excepción.
//
//  //En otra clase instanciamos la Excepcion personalizada.
//  
//  package nombre;
//  public class Excepcion0 extends Exception{
//      public Excepcion0(){
//          super("Se ha introducido el numero 0");
//      }
//  }
//
//  private int numero;
//
//  public void introducirNumeros(){ 
//
//      Scanner entrada = new Scanner(System.in);
//  
//      do{
//          System.out.println("Digite un numero: ");    
//          numero = entrada.nexInt();
//      
//          if(numero == 0){   // Quiero que se produzca una excepción personalizada.
//              throw new Exception0();
//          }
//      }while(numero != 0);
//  }
//
//  public static void main(String[] args){
//      PruebaExcepciones prueba = new PruebaExceciones();
//
//      try{
//          pruba.introducirNumeros();
//      } catch(Excepcion0 e){
//          System.out.println("Ha introducido el numero 0");
//      }
//
//      System.out.println("Programa terminado");
//  }
//
//
// 



//  public void NombreDelMetodo throws NombreDeLaExcepcion, OtraExcepcionSiEsNecesaria, OtraSiEsNecesaria{
//      Acciones..
//  }

//  try{
//      Lo que queremos que intente hacer
//  } catch (NombreDeLaExcepcion   NombreDelObjeto){
//      Mensaje o acción que hara en caso de haber una excepcion.
//  }finally{
//      El finally se ejecuta siempre.  
//    }
//
//
/**
 *
 * @author sebassvr
 */

// El error dividir para 0
public class PruebaExcepcionesKapitel1 {
    
    public static void main(String[] args) throws InputMismatchException { // El throws mas se usa cuando todavia no quieres capturar la excepcion en este metodo.
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = entrada.nextInt();
        System.out.println("El numero es: "+numero);
        
/*
        try {
            int num1=3, num2=0;
        
            int resultado = num1/num2;
        
            System.out.println("El resultado es: "+resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir para 0");
        } finally{
                System.out.println("Se ejecuta si no hubo error, o si hay error.");
        }
*/        
        
    }
}
