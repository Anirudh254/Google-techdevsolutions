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
public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int c=-1;
        String aa=A;
        int len = (10000/A.length());
        if(A.length() ==1){
          for(int i=0;i<B.length(); i++){
              if(B.charAt(i)!=A.charAt(0)){
                  c=1;
              }
          }    
            if(c==1){
                return -1;
            }
            else{
             return B.length();
        }
        }
        else{
        for(int i=1; i<(len); i++){
            if(A.indexOf(B)!=-1){
                  c=i;
                  break;
            }
            A+=aa;
        }
        return c;
        }
    }
    
}
