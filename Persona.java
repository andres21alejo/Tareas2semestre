/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @Andres
 */
public class Persona {
    public static Scanner sc = new Scanner(System.in);
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected long DPI;
    protected int cel;
    protected String email;
    protected String contra;

    public Persona(String nombre, String apellido, int edad, long DPI, int cel, String email, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DPI = DPI;
        this.cel = cel;
        this.email = email;
        this.contra = contra;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }


    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Persona.sc = sc;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
