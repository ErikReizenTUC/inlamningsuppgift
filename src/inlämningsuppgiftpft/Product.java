package inlämningsuppgiftpft;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
abstract public class Product {
    //abstract class that all products will inherit from
    
    //attributes
    public String strProductName;
    public int intPrice;
    public String strDescription;
    
    //constructor
    public Product(String strProductName, int intPrice, String strDescription)
    {
        this.strProductName = strProductName;
        this.intPrice = intPrice;
        this.strDescription = strDescription;
    }
}
