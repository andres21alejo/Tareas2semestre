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
public class Transferencia  extends Efectivo{
        static Scanner sc = new Scanner (System.in);


    public Transferencia(int Pago, String nombre) {
        super(Pago, nombre);
    }

    public void datosTrans(){
        System.out.println("Ingrese el monto de la Transferencia: "); Pago = sc.nextInt();
    }
}
