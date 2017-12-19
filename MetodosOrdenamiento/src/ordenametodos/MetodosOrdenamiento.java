
package ordenametodos;
import java.util.Arrays;

public class MetodosOrdenamiento {
    
    public static void main(String[] args){
        
        int arreglo[] = {12,4,100,1000,539,6,50,2001};
        System.out.print("El vector ingresado es: "+Arrays.toString(arreglo) +"\n");
        
        System.out.println("Vector Ordenado por el Método de Burbuja");        
        Burbuja burbuja = new Burbuja();
        burbuja.ordenar(arreglo);
        
        System.out.println("\n\n Vector Ordenado por el Método QuickShort");
        QuickShort quick = new QuickShort();
        quick.ordenarquicksort(arreglo);        
        for(int i=0; i<arreglo.length; i++)
        {
             System.out.println(arreglo[i]);
        }
        
        System.out.println("\n\n Vector Ordenado por el Método Shell Short");
        ShellShort shell = new ShellShort();
        shell.ordenar(arreglo);
        
    }
    
    
}
