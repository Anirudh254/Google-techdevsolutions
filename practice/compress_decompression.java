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
public class compress_decompression {


  public static void main(String[] args){
      
      String str = "4[3[a]b]12[a]", str1="", str2="";
      int j=0,k1=0;
      for(int i=0; i<str.length(); i++){
          str1="";str2="";
          if(str.charAt(i)==']'){
              
              for(j=i; j>0; j--){
                  if(str.charAt(j)=='['){
                      str1 = str.substring(j+1, i);
                      
                      str2 = str1;
                      k1 = j-1; String num="";
                      while(str.charAt(k1)>=48 && str.charAt(k1)<=57 && k1>0){
                          k1--;
                      }
                      if(k1==0)
                       num = str.substring(k1,j);
                      else 
                       num = str.substring(k1+1,j);   
                      System.out.println(num);
                      for(int k=1; k<Integer.parseInt(num); k++){
                       str1 += str2;
                      }
                      break;
                  }
              }
              str = str.substring(0, j-k1)+ str1 + str.substring(i+1);
              //System.out.println(str);
          }
      }
      char c= '9';
      int cc=c;
      System.out.println(str.substring(2));
  }
}
