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
public class Broker {
    private String name;
    private int INV;
    private int PL;
    private ShareHolder shareholder;
    
    public Broker(String name, int INV, int PL, ShareHolder shareholder){
        this.name = name;
        this.INV = INV;
        this.PL = PL;
        this.shareholder = shareholder;
    }

    public Broker() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Broker(ShareHolder shareHolder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getINV() {
        return INV;
    }
    
    public void setINV(int INV) {
        this.INV = INV;
    }
    
    public int getPL() {
        return PL;
    }
    
    public void setPL(int PL) {
        this.PL = PL;
    }
    
    public ShareHolder getShareHolder() {
        return shareholder;
    }
    
    public void setShareHolder(ShareHolder shareholder){
        this.shareholder = shareholder;
    }
}

