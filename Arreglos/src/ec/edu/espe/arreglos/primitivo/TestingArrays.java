/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.primitivo;
/**
 *
 * @author Daniel
 */
public class TestingArrays {

    public static void main(String[] args) {
        int[] enteros = new int[10];
        int[] otrosvalores = {8,11,2017};
        float[] flotantes = new float[5];
        System.out.println("Impresion");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
            System.out.print(+enteros[i]+",");
        }
        System.out.println("\n");
        for (float j = (float)0.1; j < 0.5; j+=(float)0.1) {
            flotantes[(int)j*10] = 1+j;
            System.out.print(+flotantes[(int)j*10]+",");
        }
        System.out.println("\n");
        for(int h=0;h<3;h++){
            System.out.print(+otrosvalores[h]+",");
        }
        System.out.println("\n");
        for(int entero:enteros){
            System.out.print(+entero+",");
        }
        System.out.println("\n");
        for(float flotante:flotantes){
            System.out.print(+flotante+",");
        }
            
    }

}
