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

    //creating user wallet globally as it is used in multiple methods
    static Wallet userWallet = new Wallet();
    
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
        int runMainMenu = 1;
        
        //loop that contains most of the program
        while (runMainMenu == 1) {
            //list of menu options
            System.out.println("Hello and welcome!");
            System.out.println("Total currency entered: " + userWallet.currencyEntered + " kr.");
            System.out.println("--------------------");
            System.out.println("1: to enter currency.");
            System.out.println("2: to browse our selection of food.");
            System.out.println("3: to browse our selection of drinks.");
            System.out.println("4: to browse our selection of candy.");
            System.out.println("5: to browse our selection of snacks.");
            System.out.println("6: to exit.");
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
                    CurrencyMenuList();
                    break;
                case 2:
                    FoodMenuList();
                    break;
                case 3:
                    DrinkMenuList();
                    break;
                case 4:
                    CandyMenuList();
                    break;
                case 5:
                    SnacksMenuList();
                    break;
                case 6:
                    //exits program after calculating change
                    userWallet.CalculateChange();
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
    
    //lists the currency input menu options
    public static void CurrencyMenuList() {

        System.out.println("Input currency to purchase products: ");
        System.out.println("--------------------");
        System.out.println("1: Insert 1 kr coin.");
        System.out.println("2: Insert 5 kr coin.");
        System.out.println("3: Insert 10 kr coin.");
        System.out.println("4: Return to Main Menu");
        System.out.println("5: Exit.");
            
        CurrencyMenuInput();       
    }
    
    //handles user currency input
    public static void CurrencyMenuInput() {
        //variable to control the while loop
        int runCurrencyMenu = 1;
        
        //while loop to make sure user can enter currency repeatedly
        while (runCurrencyMenu == 1) {
            System.out.print("Make selection: ");
            //variable to receive user input
            //catching if the user enters something other than an integer (InputMismatchException)
            try {
                int CurrencyInput = scan.nextInt();
            
                //switch case to handle user input
                switch (CurrencyInput) {
                    case 1:
                        //checks whether user tries to input currency they do not have
                        if (userWallet.numberOf1kr == 0) {
                            System.out.println("You are out of 1 kr coins, try another denomination.");
                            break;
                        }
                        else {
                            userWallet.currencyEntered += 1;
                            userWallet.numberOf1kr--;
                            System.out.println("1 kr inserted. You have " + userWallet.numberOf1kr + ": 1 kr coins remaining.");
                            System.out.println("Sum currency entered: " + userWallet.currencyEntered + " kr.");
                            break;
                        }
                    case 2:
                        if (userWallet.numberOf5kr == 0) {
                            System.out.println("You are out of 5 kr coins, try another denomination.");
                            break;
                        }
                        else {
                            userWallet.currencyEntered += 5;
                            userWallet.numberOf5kr--;
                            System.out.println("5 kr inserted. You have " + userWallet.numberOf5kr + ": 5 kr coins remaining.");
                            System.out.println("Sum currency entered: " + userWallet.currencyEntered + " kr.");
                            break;
                        }
                    case 3:
                        if (userWallet.numberOf10kr == 0) {
                            System.out.println("You are out of 10 kr coins, try another denomination.");
                            break;
                        }
                        else {
                            userWallet.currencyEntered += 10;
                            userWallet.numberOf10kr--;
                            System.out.println("10 kr inserted. You have " + userWallet.numberOf10kr + ": 10 kr coins remaining.");
                            System.out.println("Sum currency entered: " + userWallet.currencyEntered + " kr.");
                            break;
                        }
                    case 4:
                        //breaks while loop and returns to main menu once user is finished
                        System.out.println("Returning to main menu...");
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("");
                        runCurrencyMenu = 0;
                        break;
                    case 5:
                        //exits program after calculating change
                        userWallet.CalculateChange();
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
    }
    
    //lists the options for the Food category
    public static void FoodMenuList() {
        System.out.println("Food: ");
        System.out.println("Total currency entered: " + userWallet.currencyEntered + " kr.");
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
                //exits program after calculating change
                userWallet.CalculateChange();
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                //checks whether the user has enough money to pay for the product, and returns to main menu if not
                Food.foodList.get(foodInput - 1).Buy(userWallet);
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
        System.out.println("Total currency entered: " + userWallet.currencyEntered + " kr.");
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
                //exits program after calculating change
                userWallet.CalculateChange();
                System.out.println("See you next time!");
                System.exit(0);
            }
            else {
                //checks whether the user has enough money to pay for the product, and returns to main menu if not
                Drink.drinksList.get(drinkInput - 1).Buy(userWallet);
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
        System.out.println("Total currency entered: " + userWallet.currencyEntered + " kr.");
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
                //exits program after calculating change
                userWallet.CalculateChange();
                System.out.println("See you next time!");
                System.exit(0);
            }
            
            else {
                //checks whether the user has enough money to pay for the product, and returns to main menu if not
                Candy.candyList.get(candyInput - 1).Buy(userWallet);
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
        System.out.println("Total currency entered: " + userWallet.currencyEntered + " kr.");
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
                //exits program after calculating change
                userWallet.CalculateChange();
                System.out.println("See you next time!");
                System.exit(0);
            }
            //checks whether the user has enough money to pay for the product, and returns to main menu if not
            else {
                Snacks.snacksList.get(snacksInput - 1).Buy(userWallet);
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
