/**
 *
 * @author sebassvr
 */

package Ventanas;

import java.io.Serializable;

public class Atleta implements Serializable{
    private String nombre;
    private String edad;
    private String peso;
    private String estatura;

    public Atleta(String nombre, String edad, String peso, String estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
}
