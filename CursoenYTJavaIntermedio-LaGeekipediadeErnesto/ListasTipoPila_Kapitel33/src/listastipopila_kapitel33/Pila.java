package listastipopila_kapitel33;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo UltimoValorIngresado;
    int tamaño = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamaño = 0;
    }
    
    
    
    // Método para saber si la pila esta vacia.
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    // Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }
    
    // Método para eliminar un nodo de la pila.
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    
    // Método para conocer cual es el ultimo valor ingresado.
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    // Método para conocer el tamaño de la Pila
    public int TamañoPila(){
        return tamaño;
    }
    
    // Método para vaciar la Pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    // Método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while (recorrido != null) {
            Lista += recorrido.informacion+"\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
    
    
    
}
