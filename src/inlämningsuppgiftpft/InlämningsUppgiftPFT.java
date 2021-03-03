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
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
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
        
        //starting the program by calling the MainMenu() function.
        MainMenuList();

    }
    
    //lists the main menu options
    public static void MainMenuList() {
        //variable for controlling the while loop that runs the program
        int runMenu = 1;
        
        //loop that contains most of the program
        while (runMenu == 1) {
            //list of menu options
            System.out.println("Hello and welcome!");
            System.out.println("--------------------");
            System.out.println("1: to browse our selection of food.");
            System.out.println("2: to browse our selection of drinks.");
            System.out.println("3: to browse our selection of candy.");
            System.out.println("4: to browse our selection of snacks.");
            System.out.println("5: to exit.");
            System.out.println("====================");
            System.out.print("Make your selection: ");
            
            //calling function for user input for main menu
            MainMenuChoice(); 
            
        }       
    }
    
    //determines user input for main menu
    public static void MainMenuChoice() {
        //catching if the user enters something other than an integer (InputMismatchException)
        try { 
            //variable for receiving user input
            int mainMenuInput = scan.nextInt();
 
            //switch case to handle user selection in main menu
            switch (mainMenuInput) {
                case 1:
                    //sends user to Food category
                    FoodMenuList();
                    break;
                case 2:
                    //sends user to Drinks category
                    DrinkMenuList();
                    break;
                case 3:
                    //sends user to Candy category
                    CandyMenuList();
                    break;
                case 4:
                    //sends user to Snacks category
                    SnacksMenuList();
                    break;
                case 5:
                    //exits program
                    System.out.println("See you next time!");
                    System.exit(0);
                    break;
                default:
                    //handles if user input does not match menu options
                    System.out.println("Input not recognized. Make sure your selection matches menu options.");
                    System.out.println("");
                    System.out.println("====================");
                    System.out.println("");
                    break;
            }
        }
        catch (Exception InputMismatchException) {
            //error message
            System.out.println("Input not recognized. Please enter an integer.");
            System.out.println("");
            System.out.println("====================");
            System.out.println("");
            
            //clears scanner input to avoid infinite loop
            scan.next();
        }
    }
    
    //lists the options for the Food category
    public static void FoodMenuList() {
        System.out.println("Food: ");
        System.out.println("--------------------");
        
        //for-loop to print user options dynamically
        //using for loop rather than for-each in order to get the index of the object inside the loop
        for (int i = 0; i < Food.foodList.size(); i++) {
            System.out.println((i + 1) + ": " + Food.foodList.get(i).productName + ". Cost: " + Food.foodList.get(i).price + " kr.");
            System.out.println("Product description: " + Food.foodList.get(i).Description());
            System.out.println("-");
        }
        //final menu options outside the loop. using the size of foodList + 1 or 2 to determine the input number.
        System.out.println((Food.foodList.size() + 1) + ". Back to main menu.");
        System.out.println((Food.foodList.size() + 2) + ". Exit.");
        System.out.println("====================");
        System.out.print("Make your selection: ");
        
        //calling function for user input for Food category
        FoodMenuChoice();
        
    }
    
    //handles user input for the Food category
    public static void FoodMenuChoice() {
        //catching if the user enters something other than an integer (InputMismatchException)
        try {
            //variable to receive user input. 
            int foodInput = scan.nextInt();
        
            //if statement for user input
            //checks if input is outside of the range of menu options
            if (foodInput < 1 || foodInput > Food.foodList.size() + 2) {
                System.out.println("Input not recognized. Make sure your selection matches menu options.");
            }
            else if (foodInput == Food.foodList.size() + 1) {
                System.out.println("Returning to main menu...");
            }
            else if (foodInput == Food.foodList.size() + 2) {
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                Food.foodList.get(foodInput - 1).Buy();
                Food.foodList.get(foodInput - 1).Use();
            }
        
            //separator to make console easier to navigate
            System.out.println("");
            System.out.println("====================");
            System.out.println("");  
        }
        catch (Exception InputMismatchException) {
            //error message
            System.out.println("Input not recognized. Please enter an integer.");
            System.out.println("");
            System.out.println("====================");
            System.out.println("");
            
            //clears scanner input to avoid infinite loop
            scan.next();  
        }
    }
    
    //lists the options for the Drinks category
    public static void DrinkMenuList() {
        System.out.println("Drinks: ");
        System.out.println("--------------------");
        
        //for-loop to print user options dynamically
        //using for loop rather than for-each in order to get the index of the object inside the loop
        for (int i = 0; i < Drink.drinksList.size(); i++) {
            System.out.println((i + 1) + ": " + Drink.drinksList.get(i).productName + ". Cost: " + Drink.drinksList.get(i).price + " kr.");
            System.out.println("Product description: " + Drink.drinksList.get(i).Description());
            System.out.println("-");
        }
        //final menu options outside the loop. using the size of drinksList + 1 or 2 to determine the input number.
        System.out.println((Drink.drinksList.size() + 1) + ". Back to main menu.");
        System.out.println((Drink.drinksList.size() + 2) + ". Exit.");
        System.out.println("====================");
        System.out.print("Make your selection: ");
        
        //calling function for user input for Drink category
        DrinkMenuChoice();
    }
    
    //handles user input for the Drinks category
    public static void DrinkMenuChoice() {
        //catching if the user enters something other than an integer (InputMismatchException)
        try {
            //variable to receive user input. 
            int drinkInput = scan.nextInt();
        
            //if statement for user input
            //checks if input is outside of the range of menu options
            if (drinkInput < 1 || drinkInput > Drink.drinksList.size() + 2) {
                System.out.println("Input not recognized. Make sure your selection matches menu options.");
            }
            else if (drinkInput == Drink.drinksList.size() + 1) {
                System.out.println("Returning to main menu...");
            }
            else if (drinkInput == Drink.drinksList.size() + 2) {
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                Drink.drinksList.get(drinkInput - 1).Buy();
                Drink.drinksList.get(drinkInput - 1).Use();
            }
        
            //separator to make console easier to navigate
            System.out.println("");
            System.out.println("====================");
            System.out.println("");  
        }
        catch (Exception InputMismatchException) {
            //error message
            System.out.println("Input not recognized. Please enter an integer.");
            System.out.println("");
            System.out.println("====================");
            System.out.println("");
            
            //clears scanner input to avoid infinite loop
            scan.next();  
        }      
    }
    
    //lists the options for the Candy category
    public static void CandyMenuList() {
        System.out.println("Candy: ");
        System.out.println("--------------------");
        
        //for-loop to print user options dynamically
        //using for loop rather than for-each in order to get the index of the object inside the loop
        for (int i = 0; i < Candy.candyList.size(); i++) {
            System.out.println((i + 1) + ": " + Candy.candyList.get(i).productName + ". Cost: " + Candy.candyList.get(i).price + " kr.");
            System.out.println("Product description: " + Candy.candyList.get(i).Description());
            System.out.println("-");
        }
        //final menu options outside the loop. using the size of candyList + 1 or 2 to determine the input number.
        System.out.println((Candy.candyList.size() + 1) + ". Back to main menu.");
        System.out.println((Candy.candyList.size() + 2) + ". Exit.");
        System.out.println("====================");
        System.out.print("Make your selection: ");
        
        //calling function for user input for Candy category
        CandyMenuChoice();
        
    }
    
    //handles user input for the Candy category
    public static void CandyMenuChoice() {
        //catching if the user enters something other than an integer (InputMismatchException)
        try {
            //variable to receive user input. 
            int candyInput = scan.nextInt();
        
            //if statement for user input
            //checks if input is outside of the range of menu options
            if (candyInput < 1 || candyInput > Candy.candyList.size() + 2) {
                System.out.println("Input not recognized. Make sure your selection matches menu options.");
            }
            else if (candyInput == Candy.candyList.size() + 1) {
                System.out.println("Returning to main menu...");
            }
            else if (candyInput == Candy.candyList.size() + 2) {
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                Candy.candyList.get(candyInput - 1).Buy();
                Candy.candyList.get(candyInput - 1).Use();
            }
        
            //separator to make console easier to navigate
            System.out.println("");
            System.out.println("====================");
            System.out.println("");  
        }
        catch (Exception InputMismatchException) {
            //error message
            System.out.println("Input not recognized. Please enter an integer.");
            System.out.println("");
            System.out.println("====================");
            System.out.println("");
            
            //clears scanner input to avoid infinite loop
            scan.next();  
        }      
        
    }
    
    //lists the options for the Snacks category
    public static void SnacksMenuList() {
        System.out.println("Snacks: ");
        System.out.println("--------------------");
        
        //for-loop to print user options dynamically
        //using for loop rather than for-each in order to get the index of the object inside the loop
        for (int i = 0; i < Snacks.snacksList.size(); i++) {
            System.out.println((i + 1) + ": " + Snacks.snacksList.get(i).productName + ". Cost: " + Snacks.snacksList.get(i).price + " kr.");
            System.out.println("Product description: " + Snacks.snacksList.get(i).Description());
            System.out.println("-");
        }
        //final menu options outside the loop. using the size of snacksList + 1 or 2 to determine the input number.
        System.out.println((Snacks.snacksList.size() + 1) + ". Back to main menu.");
        System.out.println((Snacks.snacksList.size() + 2) + ". Exit.");
        System.out.println("====================");
        System.out.print("Make your selection: ");
        
        //calling function for user input for Snacks category
        SnacksMenuChoice();
        
    }
    
    //handles user input for the Snacks category
    public static void SnacksMenuChoice() {
        //catching if the user enters something other than an integer (InputMismatchException)
        try {
            //variable to receive user input. 
            int snacksInput = scan.nextInt();
        
            //if statement for user input
            //checks if input is outside of the range of menu options
            if (snacksInput < 1 || snacksInput > Snacks.snacksList.size() + 2) {
                System.out.println("Input not recognized. Make sure your selection matches menu options.");
            }
            else if (snacksInput == Snacks.snacksList.size() + 1) {
                System.out.println("Returning to main menu...");
            }
            else if (snacksInput == Snacks.snacksList.size() + 2) {
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                Snacks.snacksList.get(snacksInput - 1).Buy();
                Snacks.snacksList.get(snacksInput - 1).Use();
            }
        
            //separator to make console easier to navigate
            System.out.println("");
            System.out.println("====================");
            System.out.println("");  
        }
        catch (Exception InputMismatchException) {
            //error message
            System.out.println("Input not recognized. Please enter an integer.");
            System.out.println("");
            System.out.println("====================");
            System.out.println("");
            
            //clears scanner input to avoid infinite loop
            scan.next();  
        }
        
    }
    
}
