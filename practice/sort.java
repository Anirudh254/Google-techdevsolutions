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
public class sort {
   
    public static void main(String[] args){
        
        int[] ar = {1, 4, 2, 1, 8, 6, 3, 8, 6};
        int[] at = new int[ar.length];
        Arrays.sort(ar);
        int k=0;
        if(ar.length!=0){
        at[k]=ar[0];
        for(int i=1;i<ar.length;i++){
          if(at[k]==ar[i]){
              continue;
          }
            k++;
            at[k] = ar[i];
        }
        
        int[] an = new int[k+1];
        for(int i=0;i<=k;i++){
            an[i]=at[i];
        }
        
        for(int i=0;i<an.length;i++){
            System.out.print(an[i]+" ");
        }
        }
        else{
            //retutn ar
        }
    }
}
