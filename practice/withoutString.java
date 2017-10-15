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
public class withoutString {
   
    public static void main(String[] args){
       
        
        String base="abxxxxab", remove="xx";
        String ba,re;
        ba=base.toLowerCase();re=remove.toLowerCase();
        if(ba.contains(re)){
        int[] ar = new int[ba.length()];
        int j=0;
        for(int i=ba.indexOf(re); i>=0; i=ba.indexOf(re, i+re.length())){
            ar[j]=i;
            j++;
        }
        String ans="";int t=0;
        for(int i=0;i<ar.length;i++)
         System.out.print(ar[i]+" ");        
        for(int k=0; k<base.length(); ){
            if(k==ar[t]){
                k+=remove.length();
                t++;
               System.out.println(t);
            }
            else{
            if(k<base.length())
             ans+=base.charAt(k);
             k++;
            }
        }
        System.out.println(ans);
        }
        else {
            System.out.print(base);
        }
 String base1="abxxxxab", remove1="xx";
    System.out.println(base1.replaceAll(remove1, ""));
    }
    
    
}
