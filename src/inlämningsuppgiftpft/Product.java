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
    public String productName;
    public int price;
    public String description;
    
    //constructor
    public Product(String productName, int price, String description)
    {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
}
