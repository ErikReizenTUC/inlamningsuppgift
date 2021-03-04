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
    
    //ArrayList, with objects created in the main file
    static ArrayList<Food> foodList = new ArrayList<>();
    
    //methods from interface ProductActions
    @Override
    public String Description() {
        return this.description;
    }

    @Override
    public void Buy(Wallet userWallet) {
        System.out.println("You have purchased " + this.productName + " for " + this.price + " kr.");
        //calculates the remaining currency
        userWallet.currencyEntered -= this.price;
        System.out.println("You have: " + userWallet.currencyEntered + " kr remaining");
    }

    @Override
    public void Use() {
        System.out.println("It's delicious and filling!");
    }
    
}
