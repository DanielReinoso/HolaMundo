/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.model.Animal;

/**
 *
 * @author Daniel
 */
public class TestingAnimals {
    
    public static void main(String[] args) 
    {
            Animal  animalito[] = new Animal[10];
            
             
             for(int i=0 ;i<animalito.length;i++)
             {
                 animalito [i]= new Animal();
                 animalito[i].setId(i+1);
                 animalito[i].setName("Lucy");
                 if(i%2 == 0)
                 {
                     animalito[i].setOjos("Negro");
                 }
                 else
                 {
                     animalito[i].setOjos("Cafe");
                 }  
                 

             }
            for (Animal animalito1 : animalito) 
            {
                System.out.print("Nombre: " + animalito1.getName() +  "\t id:"+ animalito1.getId() + "\t  Ojos: " + animalito1.getOjos() + " ");
                System.out.println();
            }
       

    }
}
