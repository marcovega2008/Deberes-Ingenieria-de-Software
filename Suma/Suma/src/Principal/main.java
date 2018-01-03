
package Principal;

import sumar.suma;

public class main {

    
    public static void main(String[] args) {
        int a=2,b=3,resultado;
        suma sum = new suma();
        resultado = sum.sumar(a,b);
        System.out.println("La suma es: "+resultado);
        
    }
    
}
