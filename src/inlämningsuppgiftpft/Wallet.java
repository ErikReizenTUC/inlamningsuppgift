/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgiftpft;

/**
 *
 * @author Erik
 */
public class Wallet {
    //a wallet containing the users money
    
    //all the various denominations of currency that the user can have
    public int numberOf1kr;
    public int numberOf5kr;
    public int numberOf10kr;
    public int numberOf20kr;
    public int numberOf50kr;
    public int numberOf100kr;

    //tracks the total currency input by the user
    public int currencyEntered;
    
    //constructor
    public Wallet() {
        this.numberOf1kr = 10;
        this.numberOf5kr = 10;
        this.numberOf10kr = 10;
        this.numberOf20kr = 0;
        this.numberOf50kr = 0;
        this.numberOf100kr = 0;
        this.currencyEntered = 0;
    }
    
    //will calculate the change the user receives upon exiting
    public void CalculateChange() {
        //variables to store the number of various denominations the change is returned as
        int changeOf1kr = 0;
        int changeOf5kr = 0;
        int changeOf10kr = 0;
        int changeOf20kr = 0;
        int changeOf50kr = 0;
        int changeOf100kr = 0;
        
        //checking whether user gets any change at all, and skipping the rest of the method if not
        if (this.currencyEntered > 0)
            System.out.println("You get a total of: " + this.currencyEntered + " kr in change, in the following denominations:");
        
        else {
            System.out.println("You get no change.");
            return;
        }
        
        //loop to calculate the change received
        while (this.currencyEntered > 0) {
            if (this.currencyEntered >= 100){
                this.numberOf100kr++;
                changeOf100kr++;
                this.currencyEntered -= 100;
            }
            else if (this.currencyEntered >= 50) {
                this.numberOf50kr++;
                changeOf50kr++;
                this.currencyEntered -= 50;
            }
            else if (this.currencyEntered >= 20) {
                this.numberOf20kr++;
                changeOf20kr++;
                this.currencyEntered -= 20;
            }
            else if (this.currencyEntered >= 10) {
                this.numberOf10kr++;
                changeOf10kr++;
                this.currencyEntered -= 10;
            }
            else if (this.currencyEntered >= 5) {
                this.numberOf5kr++;
                changeOf5kr++;
                this.currencyEntered -= 5;
            }
            else if (this.currencyEntered >= 1) {
                numberOf1kr++;
                changeOf1kr++;
                this.currencyEntered -= 1;
            }
        }
        
        //if statement printing only the denominations the user received change for
        if (changeOf100kr > 0)
            System.out.println("100 kr bill(s): " + changeOf100kr + ".");
        if (changeOf50kr > 0)
            System.out.println("50 kr bill(s): " + changeOf50kr + ".");
        if (changeOf20kr > 0)
            System.out.println("20 kr bill(s): " + changeOf20kr + ".");
        if (changeOf10kr > 0)
            System.out.println("10 kr coins(s): " + changeOf10kr + ".");
        if (changeOf5kr > 0)
            System.out.println("5 kr coin(s): " + changeOf5kr + ".");
        if (changeOf1kr > 0)
            System.out.println("1 kr coin(s): " + changeOf1kr + ".");
    }
    
    
}
