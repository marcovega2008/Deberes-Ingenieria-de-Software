/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenametodos;

/**
 *
 * @author yavirac
 */
public class Burbuja {
    
    public void ordenar(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])//Cambiar el operador > o < para asc y desc
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
    
    
}
