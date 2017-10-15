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
public class sumNumbers {
    
    public static void main(String[] args){
    String str="abc123xyz12"+" ";String[] num=new String[str.length()];num[0]="";
        int na=0,t=0;
  for(int i=0; i<str.length()-1; i++){
    int n = str.charAt(i),n1=str.charAt(i+1);
    if((n>47 && n<58)){
          num[t]+=String.valueOf(str.charAt(i));
          if(!(n1>47 && n1<58)){
              t++;
              num[t]="";
          }
      }
  }
  for(int i=0;i<t;i++){
      na += Integer.parseInt(num[i]);
  }
  System.out.println(na);
  }
}
