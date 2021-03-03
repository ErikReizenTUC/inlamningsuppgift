/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgiftpft;

import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Food extends Product implements ProductActions {
    
    //constructor
    public Food(String productName, int price, String description)
    {
        super(productName, price, description);
    }
    
    //ArrayList
    static ArrayList<Food> foodList = new ArrayList<>();
    
    //methods from interface ProductActions
    @Override
    public void Description() {
        System.out.println(this.description);
    }

    @Override
    public void Buy() {
        System.out.println("You have purchased " + this.productName + " for " + this.price + " kr.");
    }

    @Override
    public void Use() {
        System.out.println(this.productName + " is delicious and filling!");
    }
    
}
