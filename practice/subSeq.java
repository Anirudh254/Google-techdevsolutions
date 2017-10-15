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
public class subSeq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "abppplee", s1=""; int k = 0;
        String[] ss =  {"able", "ale", "apple", "bale", "kangaroo"};
        int[] n = new int[ss.length];
        for(int i = 0; i < ss.length; i++){
            k = 0;s1="";
            for(int j = 0; j < ss[i].length(); j++){
                int c = 0;
                for( ; k < s.length(); k++){
                    if(ss[i].charAt(j) == s.charAt(k)){
                        s1 += ss[i].charAt(j);
                        break;
                    }
                }
            }
            n[i] = s1.length();
        }
        k=1;
    for(int i=0; i<n.length; i++){
    k=1; 
    for(int j=0;j<n.length;j++){
             if(n[i] < n[j]){
                 k=0;
             }
             }
     if(k==1){
         System.out.println(ss[i]);
     }
    }
  }
}    
    