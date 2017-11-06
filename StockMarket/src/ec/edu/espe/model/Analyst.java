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
public class Analyst {
    private String name;
    private String initials;
    private int day;
    
    public Analyst (String name, String initials, int day)
    {
        this.name = name;
        this.initials = initials;
        this.day = day;
    }

    public Analyst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getInitials() {
        return initials;
    }
    
     public void setInitials(String initials) {
        this.initials = initials;
    }
     
     public int getDay(){
         return day;
     }
     
     public void setDay(int day){
         this.day = day;
     }
    
    
}
