/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.model;

/**
 *
 * @author Daniel
 */
public class Computadoras {
    private String name;
    private int id;
    private String distribuidor;

    public Computadoras(String name, int id, String distribuidor) {
        this.name = name;
        this.id = id;
        this.distribuidor = distribuidor;
    }

    public Computadoras() {
         
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }
}
