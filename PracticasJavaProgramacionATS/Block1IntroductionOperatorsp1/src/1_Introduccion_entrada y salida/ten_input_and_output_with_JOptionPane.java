import javax.swing.JOptionPane;

public class ten_input_and_output_with_JOptionPane{

//ten input and output with JOptionPane    
    public static void main(String[] args){
            String cadena;
            int entero;
            char letra;
            double decimal;
            
            // Asi guardamos un string.
            cadena = JOptionPane.showInputDialog("Digite una cadena: ");

            //Asi guardamos un entero por consola. Transformando la cadena con Integer.parseInt
            entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); 

            // Así guardamos un carácter.
            letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);

            // Asi guardamos un double.
            decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

            // Para mostrar:

            JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);

            JOptionPane.showMessageDialog(null,"El numero entero es: "+entero);
        
            JOptionPane.showMessageDialog(null,"La caracter es: "+letra);
            
            JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);


        }

}
