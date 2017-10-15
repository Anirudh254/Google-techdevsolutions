/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

/**
 *
 * @author Go
 */
public class evenlySpaced {
    
public static void main(String[] args){
    
     int a=1,b=2,c=3;
     int[] an = new int[3];
     an[0]=a;an[1]=b;an[2]=c;
     Arrays.sort(an);
     if((an[2]-an[1]) == (an[1]-an[0])){
         System.out.println("true");
     }
     else{
         System.out.println("false");
     }
}

}
