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
public class Company {
    private String name;
    private int Q;
    private int PT;
    private int PP;
    private int PF;
    private int ST;
    private int SP;
    private Analyst analyst;
    private Broker broker;
    private ShareHolder shareholder;
    
    public Company(String name,int Q, int PT, int PP, int PF, int ST, int SP, Analyst analyst, Broker broker, ShareHolder shareholder){
        this.name = name;
        this.Q = Q;
        this.PT = PT;
        this.PP = PP;
        this.PF = PF;
        this.ST = ST;
        this.SP = SP;
        this.analyst = analyst;
        this.broker = broker;
        this.shareholder = shareholder;
    }

    public Company(String favorita) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
     public int getQ(){
         return Q;
     }
     
     public void setQ(int Q){
         this.Q = Q;
     }
     
     public int getPT(){
         return PT;
     }
     
     public void setPT(int PT){
         this.PT = PT;
     }
     
     public int getPP(){
         return PP;
     }
     
     public void setPP(int PP){
         this.PP = PP;
     }
     
     public int getPF(){
         return PF;
     }
     
     public void setPF(int PF){
         this.PF = PF;
     }
     
     public int getST(){
         return ST;
     }
     
     public void setST(int ST){
         this.ST = ST;
     }
     
     public int getSP(){
         return SP;
     }
     
     public void setSP(int SP){
         this.SP = SP;
     }
    
    public Analyst getAnalyst() {
        return analyst;
    }
    
    public void setAnalyst(Analyst analyst){
        this.analyst = analyst;
    }
    
    public Broker getBroker() {
        return broker;
    }
    
    public void setBroker(Broker broker){
        this.broker = broker;
    }
    public ShareHolder getShareHolder() {
        return shareholder;
    }
    
    public void setShareHolder(ShareHolder shareholder){
        this.shareholder = shareholder;
    }
}
