/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mainxd {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner (System.in);
    
    static int eleccion;
    public static void main(String[] args){
        Piloto piloto = new Piloto ("#", "#", " #", 8, 8, 8, "#", "#");
        System.out.println("Seleccione qué quiere hacer: \nEntrar cómo cliente (1) \nIngresar un nuevo conductor(2)");
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1: Cliente();
            break;
            case 2: piloto.imgresarPiloto();
            default:
                break;
        }
    }
    
     public static void Cliente(){
        Usuario pp = new Usuario (7, "#", "#", 7, 7, 7, "#", "#");
        Piloto piloto = new Piloto ("#", "#", "#", 8, 8, 8, "#", "#");
        tarjeta tar = new tarjeta (8, 8, 8,8,8, " ");
        Trayectoria cc = new Trayectoria (8, "#", "#", "#", "#", 8, 8, 8, "#", "#");
        Transferencia add = new Transferencia (8, "#");
        Servicios dd = new Servicios ();
        pp.datosus();
        cc.datosdes();
        dd.Servicio();
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1: dd.X();
            break;
            case 2: dd.black();
            break;
            case 3: dd.suv();
            break;
            case 4: dd.pool();
            break;
            default:
                break;
        }
        System.out.println("Seleccione uno de los 2 conductores disponibles" );
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                piloto.Pil1();
                break;
            case 2:
                piloto.Pil2();
                break;
            default:
                break;
        }
        System.out.println("Seleccione su metodo de pago \nTarjeta de credito(1) \nEfectivo(2)");
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1: tar.datosPiloto();
                break;
            case 2: add.datosTrans();
                break;
            default:
                break;
        }
    }
    
}
