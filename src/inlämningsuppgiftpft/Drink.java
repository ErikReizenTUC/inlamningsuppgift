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
public class Drink extends Product implements ProductActions{
    
    //constructor
    public Drink(String strProductName, int intPrice, String strDescription)
    {
        super(strProductName, intPrice, strDescription);
    }
    
    //ArrayList
    ArrayList<Drink> drinksList = new ArrayList<>();
    
    //methods from interface ProductActions
    @Override
    public void Description() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Buy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Use() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
