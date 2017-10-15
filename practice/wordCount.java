/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;

/**
 *
 * @author Go
 */
public class wordCount {
    
  public static void main(String[] args){
     String[] strings = {"a", "b", "a", "c", "b", "a"};
     Map<String, Integer> map = new HashMap<String, Integer>();
     for(int i=0; i<strings.length; i++){
       int count = 0;
         for(int j =0; j<strings.length; j++){
           if(strings[i]==strings[j]){
               count++;
           }
       }
         map.put(strings[i], count);
     }
     
     System.out.println(map.get("a"));
  }
}
