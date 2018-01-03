/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import sumar.suma;

/**
 *
 * @author David
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2,b=3,resultado;
        suma sum = new suma();
        resultado = sum.sumar(a,b);
        System.out.println("La suma es: "+resultado);
        
    }
    
}
