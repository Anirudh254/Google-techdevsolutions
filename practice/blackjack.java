/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Go
 */
public class blackjack {
    
public static void main(String[] args){
    
    int a = 19, b = 21;
        if(a>21 && b>21){
         System.out.println("0");    
        }
        if(a<=21 && b>21){
            System.out.println(a);
        }
        if(a>21 && b<=21){
           System.out.println(b);
        }    
        if(a<=21 && b<=21)
        {
            if(a>=b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
        }

}
