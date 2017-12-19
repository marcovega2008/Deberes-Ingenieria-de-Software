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
public class ShellShort {

    public void ordenar(int vector[]) {
        int num = vector.length;
        for (int increment = num / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < num; i++) {
                for (int j = i; j >= increment && vector[j - increment] > vector[j]; j -= increment) {
                    int temp = vector[j];
                    vector[j] = vector[j - increment];
                    vector[j - increment] = temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

}
