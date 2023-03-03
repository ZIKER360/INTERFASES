
package clases;

import java.util.ArrayList;


public class Contacto {
private int codigo;
private String nombre;
private String apellido;
private String direccion;
private String correo;
private String telefono;
private ArrayList<Numero> numeros;
    
public Contacto(){
numeros= new ArrayList();
}  

    public Contacto(int codigo, String nombre, String apellido, String direccion, String correo, String telefono, ArrayList<Numero> numeros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.numeros = numeros;
        this.telefono= telefono;
    }

    public Contacto(int codigo, String nombre, String apellido, String direccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono= telefono;
        numeros= new ArrayList();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }
 
    
}
