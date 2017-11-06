/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.stockmarket;

import ec.edu.espe.model.Company;
import ec.edu.espe.model.Analyst;
import ec.edu.espe.model.ShareHolder;
import ec.edu.espe.model.Broker;
/**
 *
 * @author Daniel
 */
public class stockMarket {
    public static void main(String[] args) {
        Company company = new Company("Favorita");
        Analyst analyst = new Analyst();
        Broker broker = new Broker();
        ShareHolder shareholder = new ShareHolder();
        company.setName("Favorita");
        System.out.println("Nombre es "+company.getName());
            
        
    }
}
