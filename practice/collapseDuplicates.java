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
public class collapseDuplicates {
    

public static void main(String[] args){

     String a="aaabbccvbfggg",ab=a;
     int i = 0; 
    String result = ""; 
    while (i < a.length()) { 
      char ch = a.charAt(i); 
      result += ch; 
      while (i<a.length()-1 && a.charAt(i+1) == ch) { 
        i++; 
      } 
      i++; 
    }
    System.out.println(result);
     
}

}
