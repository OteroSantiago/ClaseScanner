/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescanner;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        
        Scanner lectura = new Scanner(System.in);
        var nombre = lectura.nextLine();
        System.out.println("Tu nombre: "+nombre);
        
        System.out.println("Escribe tus apellidos: ");
        var apellidos = lectura.nextLine();
        
        System.out.println("Tu nombre y apellidos son: " + nombre + " " + apellidos);
        
    }
    
}
