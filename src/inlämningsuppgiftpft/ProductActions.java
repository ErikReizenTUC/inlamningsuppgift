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
public interface ProductActions {
    //interface where mandatory actions for products will be contained
    String Description();
    void Buy(Wallet userWallet);
    void Use();
    
}
