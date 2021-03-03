/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgiftpft;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class InlämningsUppgiftPFT {
    //Scanner object for user input
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //variable to control do-while loop
        int intRun = 1;
        int intUserInput;
        
        //creating instances of Food objects
        Food.foodList.add(new Food("Pan pizza", 19, "Frozen pan pizza, perfect for the microwave!"));
        Food.foodList.add(new Food("Ham and cheese sandwich", 15, "Ham and cheese sandwich with sliced peppers, on rye bread."));
        Food.foodList.add(new Food("Tomato soup", 29, "Tomato soup, ready to be heated up or just eaten straight out of the cup!"));
        
        //creating instances of Drink objects
        Drink.drinksList.add(new Drink("Soft drink", 15, "Soft drink, cold and refreshing!"));
        Drink.drinksList.add(new Drink("Sparkling water", 10, "Natural water, lightly carbonated!"));
        Drink.drinksList.add(new Drink("Coffee", 19, "Coffee, for when you need to wake up!"));
        
        //creating instances of Candy objects
        Candy.candyList.add(new Candy("Chocolate bar", 10, "Milk chocolate bar, with hazelnuts for extra crunch!"));
        Candy.candyList.add(new Candy("Gummy bears", 15, "A pack of sweet gummy bears."));
        Candy.candyList.add(new Candy("Sour candies", 15, "A pack of sour candies."));
        
        //creating instances of Snacks objects
        Snacks.snacksList.add(new Snacks("Sourcream and onion chips", 15, "A pack of sourcream and onion chips."));
        Snacks.snacksList.add(new Snacks("Salted peanuts", 10, "A pack of salted peanuts."));
        Snacks.snacksList.add(new Snacks("Cheese Doodles", 19, "A pack of cheese doodles."));

    }
    
    public static void MainMenu() {
        
    }
    
    public static void FoodMenu() {
        int Foodinput;
    }
    
    public static void DrinkMenu() {
        
    }
    
    public static void CandyMenu() {
        
    }
    
    public static void SnacksMenu() {
        
    }
    
}
