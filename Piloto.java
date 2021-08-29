/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @Andres
 */
public class Piloto extends Persona {
    private String tipoLicencia;

    public Piloto(String tipoLicencia, String nombre, String apellido, int edad, long DPI, int cel, String email, String contra) {
        super(nombre, apellido, edad, DPI, cel, email, contra);
        this.tipoLicencia = tipoLicencia;
    }



    public void imgresarPiloto(){
         System.out.println("Ingrese su nombre: "); nombre = sc.next();
        System.out.println("Ingrese su apellido: "); apellido = sc.next();
        System.out.println("Ingrese su edad: "); edad = sc.nextInt();
        System.out.println("Ingrese su número de DPI: "); DPI = sc.nextLong();
        System.out.println("Ingrese su número de teléfono: "); cel = sc.nextInt();
        System.out.println("Ingrese su tipo de licencia: "); tipoLicencia = sc.next();
        System.out.println("Ingrese su correo de registro: "); email = sc.next();
        System.out.println("Ingrese su contraseña: "); contra = sc.next();
    }
    public void Pil1(){
        System.out.println("Pablo Cruz \nTipo de licencia B");
    }
    public void Pil2(){
        System.out.println("Hector Herrera \nTipo de licencia B");
    }
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    
}