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
public class maxSpan {

    public static void main(String[] args){
    
      int[] ab = {1, 4, 2, 1, 4, 4, 4};
      int[] ct = new int[ab.length];
      int t=0;
      for(int i=0; i<ab.length; i++){
          for(int j=0; j<ab.length; j++){
              if(ab[i]==ab[j]){
                t=j;    
              }
          }
          ct[i]=(t-i)+1;
      }
      t=0;
      for(int i=0;i<ct.length;i++){
        t=0;
          for(int j=0;j<ct.length;j++){
            if(ct[i]<ct[j]){
                t=1;
            }
        }
       if(t==0){
           System.out.println(ct[i]);
       }
      }
    }

}
