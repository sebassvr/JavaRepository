/* Interfaces gráficas.
Capitulo 1 al 13.

Primero va el JFrame.
JPanel = Panel que van encima del JFrame, como si fuera un escritorio y un mantel encima.
JLabel = Etiquetas de texto o imagenes y estas van encima del JPanel.
JButton = Son botones de click normales.
JRadioButton = Son Radio Botones, estos nos dan opciones tipo encuesta, donde si presionamos en el circulo se pone un puntito.
JToggleButton = Botones de activación para seleccionar una o multiples opciones.
JTextField = Caja de texto en la cual se puede escribir datos o cualquier cosa de una sola linea.
JTextArea = Caja de texto de multiples lineas, se vale dar enter para dar saltar a otra linea.
JScrollPane = Con esto podemos tener barras de desplazamiento.
JCheckBox = Es una casilla de verificación donde si haces click en el cuadrito se pone un visto, como un listado.
JComboBox = Da una lista donde se puede seleccionar una de las opciones.

*/

package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {
    // Creamos el panel como una tributo de tipo public.
    public JPanel panel = new JPanel();
    
    // VENTANA DE JFRAME.
    public Ventana(){
        setSize(500, 500); // Establecemos el tamaño de la ventana.
        this.setTitle("El mejor titulo"); // Establecemos el titulo.
        //setLocation(500, 150);  // Establecemos la localizacion de la ventana.
        //setBounds(0, 0, 200, 500);  // Establecemos la localizacion de la pantalla y el ancho y altura.
        this.setLocationRelativeTo(null); //Establecemos la ventana en el centro.
        
        //setResizable(false); // Hacemos que no se pueda redimenzionar la ventana con false.
        this.setMinimumSize(new Dimension(300,300)); // Establecemos el tamaño minimo.
        
        //this.getContentPane().setBackground(Color.PINK); // Establecer el color de la ventana.
        
        
        
        // LLAMAMOS LA FUNCION DEL PANEL.
        iniciarComponentes(); // Llamamos el metodo para agregar el panel.
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // A lo que le damos a la x automaticamente termina la ejecución.
        
        
    }
    
    // PANEL DE JPANEL.
    private void iniciarComponentes(){
    // Llamamos al panel(JPanel).
        colocarPaneles();
    
    // Llamamos a las etiquetas(JLabel).
        //colocarEtiquetas();
        
    // Llamamos a los botones(JButton).
        //colocarBotones();
    // Llamamos los RadioBotones(JRadioButton).
        //colocarRadioBoton();
        
    // Llamamos los Botones de Activacion(JToggleButton).
        //colocarBotonesDeActivacion();
    
    // Llamamos las Cajas de Texto(JTextField).
        //colocarCajasDeTexto();
        
    // Llamamos a las Areas de Texto(JTextArea).    
        //colocarAreasDeTexto();
        
    // LLamamos las casillas de verificacion(JCheckBox). 
        //colocarCasillasDeVerificacion();
    
    // LLamamos a la lista desplegable(JComboBox).
        //colocarListasDesplegables();
        
    // Llamamos al campo de contraseña(JPasswordField).
        //colocarCampoDeContraseña();
    
    // Llamamos a la Tabla(JTable).
        //colocarTablas();
    // Llamamos a la Lista(JList).
        colocarListas(); 
    }
    
    
    private void colocarPaneles(){
        
        panel = new JPanel(); // Creamos un panel.
        //panel.setBackground(Color.CYAN); // Establecemos el color del panel.
        
        panel.setLayout(null); // Desactivamos el diseño.
    // AGREGAMOS EL PANEL.
        this.getContentPane().add(panel); // Agregamos el panel.
           
    }
    
    private void colocarEtiquetas(){
           // ETIQUETA DE JLABEL.
        JLabel etiqueta = new JLabel(); // Creamos una etiqueta.
        etiqueta.setText("Mundial 2018"); // Establecemos el texto de la etiqueta.
        etiqueta.setBounds(85, 10, 300, 80); // Para que funcione esto, debemos desactivar el diseño por defecto
        etiqueta.setHorizontalAlignment(0); // Para alinear el texto: 0 en el centro, 2 a la izquierda, 4 a la derecha.
        etiqueta.setForeground(Color.BLACK); // Establecemos el color de la letra.
        //etiqueta.setOpaque(true); // Establecemos pintar el fondo de la etiqueta.
        //etiqueta.setBackground(Color.BLACK); // Primero desactivamos para que funcione el establecer el color de fondo de la etiqueta.
        etiqueta.setFont(new Font("cooper black",0,40)); // Establecemos tipo de letra, estilo de letra y tamaño.
        // El estilo lo podemos poner por numeros igual, 0 es normal. 1 es negrita. 2 es cursiva. 3 es negrita y cursiva.
        
        // AGREGANDO LA ETIQUETA DE JLABEL AL JPANEL.
        panel.add(etiqueta); // Agregamos la etiqueta al panel.
        
        
        // ETIQUETA 2
        
        // Esto: 
        //JLabel etiqueta2 = new JLabel(new ImageIcon("foto.png")); // Agregamos la foto con (new ImageIcon(direccion de la imagen));
        // o:
        //ImageIcon imagen = new ImageIcon("foto.png");
        //JLabel etiqueta2 = new JLabel(imagen);
        // O esto:
        //JLabel etiqueta2 = new JLabel();
        //etiqueta2.setIcon(new ImageIcon("foto.png"));
        
        ImageIcon imagen = new ImageIcon("foto.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(87, 90, 300, 250);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(),Image.SCALE_SMOOTH)));    
        
        panel.add(etiqueta2); // Agregamos al panel.
       
   }

// Creamos los botones para colocarlos.   
    private void colocarBotones(){
    
// Boton 1 - boton de texto.
       JButton boton1 = new JButton();
       boton1.setText("Click"); // Establecemos el texto.
       boton1.setBounds(100, 100, 100, 40);
       
       boton1.setEnabled(true); // Habilitamos el boton o desabilitamos.
       boton1.setMnemonic('a'); // Establecemos alt + a.
       
// Video 14.
       boton1.setForeground(Color.BLUE); // Establecemos el color de la letra.
       boton1.setFont(new Font("cooper black",3,20));
       
       panel.add(boton1);
       
// Boton 2 - boton de imagen.
       //ImageIcon icon = new ImageIcon("foto.png"); // Es una forma de colocar la imagen, pero se queda del tamaño que es.
       JButton boton2 = new JButton();
       
       boton2.setBounds(100, 200, 100, 40); // Establecemos el tamaño del boton.
       
// Video 15.
       ImageIcon clickAqui = new ImageIcon("click.png"); // Creamos el objeto para la foto.
       
        // Agregamos al boton y definimos el tamaño.
       boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(), Image.SCALE_SMOOTH)));
       
       boton2.setOpaque(true); // En algunas versiones no se podra
       // poner un color de fondo sin habilitar la opcion con setOpaque(true);
       boton2.setBackground(Color.BLUE); // Establecemos el color de fondo.
       
       // AGREGAMOS EL BOTON DE JBUTTON AL JPANEL.
       panel.add(boton2);

// Video 16.
//Boton 3 - boton de bordes.
       JButton boton3 = new JButton("Prueba borde");
       boton3.setBounds(100, 300, 110, 50);
       // Para los bordes.(colordelborde, gruesodelborde, true=borderedondeado);
       boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 10, true));
       // Agregamos el boton al panel.
       panel.add(boton3);
      
   }
   
// VIDEO 17   
    private void colocarRadioBoton(){
        // Creamos otro RadioBoton1.
       JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true); // (Texto,true=indicamos que se puede seleccionar una opcion);
       radioBoton1.setBounds(50,100, 200, 50); // Ubicamos y damos tamaño.
       radioBoton1.setEnabled(true); // Es para establecer como disponible o no.
       radioBoton1.setText("Programación"); // Establecemos el texto
       radioBoton1.setFont(new Font("cooper black", 0, 20)); // Ponemos un tipo,style,tamaño de letra.
       
       // Agregamos el JRadioButton al panel.
       panel.add(radioBoton1);
       
       // Creamos otro RadioBoton2.
       JRadioButton radioBoton2 = new JRadioButton("Opcion 2",true); // (Texto,true=indicamos que se puede seleccionar una opcion);
       radioBoton2.setBounds(50,150, 100, 50); // Ubicamos y damos tamaño.
       // Agregamos el JRadioButton al panel.
       panel.add(radioBoton2);
       
       // Creamos otro RadioBoton3.
       JRadioButton radioBoton3 = new JRadioButton("Opcion 3",true); // (Texto,true=indicamos que se puede seleccionar una opcion);
       radioBoton3.setBounds(50,200, 100, 50); // Ubicamos y damos tamaño.
       // Agregamos el JRadioButton al panel.
       panel.add(radioBoton3);
       
       // Creamos un grupo de botones asi solo podemos seleccionar una opcion.
       ButtonGroup grupoRadioBotones = new ButtonGroup();
       grupoRadioBotones.add(radioBoton1);
       grupoRadioBotones.add(radioBoton2);
       grupoRadioBotones.add(radioBoton3);
       
   }
    
// VIDEO 18   
    private void colocarBotonesDeActivacion(){
        // Creamos un JToggleButton1.
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1",true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        // Agregamos al panel.
        panel.add(botonActivacion1);
        
        // Creamos un JToggleButton2.
        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2",true);
        botonActivacion2.setBounds(50, 150, 100, 40);
        // Agregamos al panel.
        panel.add(botonActivacion2);
        
        // Creamos un JToggleButton3.
        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3",false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        // Agregamos al panel.
        panel.add(botonActivacion3);
    
        // Creamos un grupo de Botones Activados para solo poder seleccionar uno solo.
        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
    }

// VIDEO 19    
    private void colocarCajasDeTexto(){
       JTextField cajaTexto = new JTextField();
       
       cajaTexto.setBounds(50, 50, 200, 30);
       cajaTexto.setText("Hola...");
       System.out.println("Texto en la caja: "+cajaTexto.getText()); // Obtenemos el texto y lo imprimimos.
       
       panel.add(cajaTexto); // Agregamos la caja de texto.

   }
    
// VIDEO 20 // Creamos un area de texto, vale presionar enter.
    private void colocarAreasDeTexto(){
       JTextArea areaTexto = new JTextArea();
       areaTexto.setBounds(20, 20, 300, 200);
       areaTexto.setText("Escriba el texto aqui...");
       areaTexto.append("\nEscribe por aqui..."); // Este metodo añade mas texto al area.
       areaTexto.setEditable(true); // Con esto hacemos que no se pueda borrar el texto. Editar el area de texto.
       
       System.out.println("El texto es:"+areaTexto.getText());
       
       panel.add(areaTexto);
       
// VIDEO 21
        // Barras de desplazamiento(JScrollPane)
        
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Pasamos el objeto al que queremos agregar el Scroll Pane.
        barrasDesplazamiento.setBounds(20, 20, 300, 200); // Recomendablemente pasar las mismas medidas de donde lo vamos agregar.
        
        // Podemos usar estos dos metodos o usarlos una sola en el constructor.
        //barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); // Aqui ponemos que asome la barra vertical cuando se necesite la barra.
        //barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);  // Aqui ponemos que asome la barra horizantal cuando se necesite la barra.
        
        // Agregamos la barra al panel.
        panel.add(barrasDesplazamiento);
        
   } 
   
// VIDEO 22
    private void colocarCasillasDeVerificacion(){
       // Tambien podemos cambiar el tipo de letra, fondo entre otras cosas...
       JCheckBox casillaVerificacion1 = new JCheckBox("Leche", true);
       casillaVerificacion1.setEnabled(false); // Activamos o desactivamos esta casilla de verificacion.
       casillaVerificacion1.setBounds(20, 20, 100, 40);
       panel.add(casillaVerificacion1);
       
       JCheckBox casillaVerificacion2 = new JCheckBox("Galletas");
       casillaVerificacion2.setBounds(20, 60, 100, 40);
       panel.add(casillaVerificacion2);
       
       JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt");
       casillaVerificacion3.setBounds(20, 100, 100, 40);
       panel.add(casillaVerificacion3);
       
       JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
       casillaVerificacion4.setBounds(20, 140, 100, 40);
       panel.add(casillaVerificacion4);
       
   }
   
// VIDEO 23 y 24
   
    private void colocarListasDesplegables(){
/*  
        String[] paises = {"Peru","Colombia","Paraguay","Ecuador"};
       
        // Tambien podemos cambiar la letra, tipo, tamaño, entre otras cosas.
        
        JComboBox listaDesplegable1 = new JComboBox(paises); // Debemos pasar un array de Strings.
        listaDesplegable1.setBounds(20, 20, 100, 30);
       
        listaDesplegable1.addItem("Argentina"); // Agregamos más objeto al JComboBox.
        listaDesplegable1.setSelectedItem("Ecuador");// Selecionamos el primer objeto a vista.
       
        panel.add(listaDesplegable1);
*/      
// VIDEO 24
        // Creamos objetos de la clase persona.
        Persona persona1 = new Persona("Sebastian Valverde", 21, "Ecuatoriano");
        Persona persona2 = new Persona("Jennifer Alcivar", 19, "Ecuatoriana");
        
        // Creamos modelo de JComboBox Model.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        
        // Agregamos los objetos al modelo.
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        
        listaDesplegable.setBounds(20, 20, 200, 30); // Ubicacion y tamaño.
        panel.add(listaDesplegable); // Agregamos al panel.

    }

// VIDEO 25
    private void colocarCampoDeContraseña(){
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 150, 30); // Ubicacion y tamaño.
        campoContraseña.setText("Programacion"); // Agregamos un texto al campo de contraseña.
        panel.add(campoContraseña); // Campo de contraseña.
        
        String contraseña = ""; // Creamos un String para guardar la contraseña.
        for(int i = 0; i < campoContraseña.getPassword().length ; i++){ // Recorremos los char de la contraseña para ir guardando en el String.
            contraseña += campoContraseña.getPassword()[i];
        }
        
        System.out.println("Contrasena: "+contraseña); //Imprimimos la contraseña.
        
    }

// VIDEO 26
    private void colocarTablas(){
        // Para usar debemos instanciar la clase DefaultTableModel();
        DefaultTableModel modelo = new DefaultTableModel();
        
        // Agregamos la columna a la tabla.
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        // Creamos arreglos para agregar las filas.
        String[] persona1= {"Sebastian","21","Ecuatoriano"};
        String[] persona2= {"Rosa","20","Ecuatoriano"};
        String[] persona3= {"Joso","22","Peruano"};
        String[] persona4= {"Sebastian","21","Ecuatoriano"};
        String[] persona5= {"Paklmkd","18","Venezolano"};
        String[] persona6= {"Pako","25","Español"};
        String[] persona7= {"Sofia","23","Ecuatoriano"};
        String[] persona8= {"Jenni","21","Argentino"};
        String[] persona9= {"Tato","22","Frances"};
        String[] persona10= {"Dorito","21","Ecuatoriano"};
        String[] persona11= {"Kilo","21","Cubano"};
        String[] persona12= {"King","20","Ecuatoriano"};
        String[] persona13= {"Papo","19","Argentino"};
        
        // Agregamos los arreglos a las filas.addRow.
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
        
        
        JTable tabla = new JTable(modelo); // Creamos un objeto de table.
        
        tabla.setBounds(20, 20, 300, 200); // Definimos ubicacion y tamaño.
        panel.add(tabla); // Agregamos al panel.
        
        // Creamos un objeto de JScrollPane y ya nos aparece la tabla.
        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
        
    }
   
// VIDEO 27 
    private void colocarListas(){
        // Creamos un modelo de interfaz para lista.
        DefaultListModel modelo = new DefaultListModel();
        
        // Agregamos un elemento a la lista utilizando la clase persona que creamos.
        modelo.addElement(new Persona("Sebastian iosdngkhds", 21, "Ecuatoriano"));
        modelo.addElement(new Persona("Estefany hhjfhdjdf", 20, "Ecuatoriana"));
        modelo.addElement(new Persona("Jennifer gsdkjhghjew", 20, "Ecuatoriana"));
        modelo.addElement(new Persona("Sofia gkjeiogjew", 21, "Ecuatoriana"));
        modelo.addElement(new Persona("Panc gewoijgpoew", 20, "Ecuatoriana"));
        modelo.addElement(new Persona("Robert geslñkgod", 22, "Ecuatoriana"));
        modelo.addElement(new Persona("Messi gkdegjoe", 33, "Ecuatoriana"));
        modelo.addElement(new Persona("Ronaldo fklsdmgd", 35, "Ecuatoriana"));
        modelo.addElement(new Persona("Ronald bgmopmgepo", 23, "Ecuatoriana"));
        modelo.addElement(new Persona("Benito mkerniow", 30, "Ecuatoriana"));
        modelo.addElement(new Persona("klsg gmdogmdwpo", 25, "Ecuatoriana"));
        modelo.addElement(new Persona("Yay dmgoewgopew", 22, "Ecuatoriana"));
        modelo.addElement(new Persona("Rod qrfhqiwrq", 15, "Ecuatoriana"));
        modelo.addElement(new Persona("Lala fqwojfgoiqwjgio", 35, "Ecuatoriana"));
        modelo.addElement(new Persona("Lolo gweodkgwogjoewgjewogewogw", 15, "Ecuatoriana"));
        modelo.addElement(new Persona("Pink ewkgpowegp", 35, "Ecuatoriana"));
        modelo.addElement(new Persona("Coco geskognewkng", 25, "Ecuatoriana"));
        modelo.addElement(new Persona("Tipi gewkngiewg", 45, "Ecuatoriana"));
        modelo.addElement(new Persona("Tapa gnsweognewkog", 25, "Ecuatoriana"));
        
        // Creamos la lista y en los parametros agregamos el modelo. Luego definimos ubicacion y tamaño y agg al panel.
        JList lista = new JList(modelo); 
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista); 
    
        // Agregamos un scroll para poder observar el resto de la lista cuando necesitemos.
        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
        
    }
  
    
    /*try(
                FileWriter fw = new FileWriter("fichero1.txt");
                FileReader fr = new FileReader("fichero1.txt")
            ){
            
            // Abro stream, crea el fichero si no existe.
            //FileWriter fw = new FileWriter("fichero1.txt");
            
            //Escribimos en el fichero un String y un caracter  97 = (a) en asci.
            fw.write("Esto es una prueb");
            fw.write(97);
            fw.write("\r\n"); // Salto de linea.
            // Cierro el stream.
            
            // Guardamos los cambios del fichero.
            fw.flush();

                // Abre el stream el fichero debe existir.
            //FileReader fr = new FileReader("fichero1.txt");
            //Leemos el fichero y lo mostramos por pantalla.
            int valor = fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor = fr.read();
            }
            // Cerramos el stream.
            
        }catch(IOException e){
            System.out.println("Error E/S"+e);
        }*/
   
}
