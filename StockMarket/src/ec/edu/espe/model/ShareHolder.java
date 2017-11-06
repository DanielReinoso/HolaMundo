/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Daniel
 */
public class ShareHolder {
    private String name;
    private Analyst analyst;
    
    public ShareHolder(String name, Analyst analyst){
        this.name = name;
        this.analyst = analyst;
    }

    public ShareHolder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ShareHolder(Analyst analyst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Analyst getAnalyst() {
        return analyst;
    }
    
    public void setAnalyst(Analyst analyst){
        this.analyst = analyst;
    }
}
