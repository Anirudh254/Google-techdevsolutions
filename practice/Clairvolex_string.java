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
public class Clairvolex_string {
    
    
    
   public static void main(String[] args){
       
       char[][] ab = {{'a','b','a'},
                      {'x','y','z'},
                      {'b','a','r'}};
       
       for(int i=0; i<ab.length; i++){
           System.out.println(ab[i]);
       }
       
       String str = "axbaydb";
       int c=1,k=0;
       for(int i=0; i<str.length() && k<ab.length; i++){
           if(String.valueOf(ab[k]).contains(String.valueOf(str.charAt(i)))){
               int j = String.valueOf(ab[k]).indexOf(str.charAt(i));
               System.out.println(String.valueOf(ab[k]));
               ab[k][j] =' ';
               k++;
           }
           else{
               c=0;
               break;
           }
       }
   if(c==1){
       System.out.println("true");
   }
   
   }
}
