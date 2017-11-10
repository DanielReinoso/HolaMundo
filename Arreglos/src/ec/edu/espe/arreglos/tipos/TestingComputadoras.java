/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.model.Computadoras;

/**
 *
 * @author Daniel
 */
public class TestingComputadoras {
    public static void main(String[] args) {
        Computadoras computador[] = new Computadoras[10];
        for(int i=0;i<computador.length;i++){
            computador[i] = new Computadoras();
            computador[i].setName("DELL");
            computador[i].setId(123);
            if(i%2==0)
            {
                computador[i].setDistribuidor("DPVWORLD");
            }
            else
            {
                computador[i].setDistribuidor("AMAZON");
            }
        }
        for (Computadoras computador1 : computador) {
            System.out.print("Computador: " + computador1.getName() + " id: " + computador1.getId() + " Distribuidor: " +computador1.getDistribuidor());
            System.out.println();
        }
    }
    
    
}
