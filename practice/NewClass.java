/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.math.BigInteger;
import static practice.even_fibonacci.isPrime;

/**
 *
 * @author Go
 */
public class NewClass {
    
    public static void main(String[] args){
    
     System.out.println(isPrime(new BigInteger("7")));
     BigInteger lim = new BigInteger("13195");
     for(BigInteger i = new BigInteger("2"); i.compareTo(lim) == -1; i = i.add(new BigInteger("1"))){
         if(isPrime(i)){
             if(lim.mod(i).equals(new BigInteger("0"))){
              System.out.println(lim.mod(i).equals(new BigInteger("0")));
             }
         }
     }
    }
}