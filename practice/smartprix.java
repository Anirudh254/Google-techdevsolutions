/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Go
 */
public class smartprix {
    
   
    public static void parsing(){
        Scanner in = new Scanner(System.in);
        String str=null,ab="",input;int c=0;
        int index_space=0;
        while(true){
            c=0;
            input = in.nextLine();
        if(input.equals("end")) {
          ab=input;
        }
        else{
            index_space = input.indexOf(" ");
            ab = input.substring(0,index_space);
        }    
        switch(ab){
                case "define":
                    str = input.substring(index_space+1);
                    System.out.println(str);
                    break;
                case "toupper":
                    str=str.toUpperCase();
                    System.out.println(str);
                    break;
                case "append_a":
                    str = str + str.toUpperCase();
                    System.out.println(str);
                    break;
                case "end":
                    c=1;
                    break;
                case "print":
                    System.out.println(input.substring(index_space+1));
                    break;
                case "append toupper":
                    str = str + str.substring(str.indexOf("r")+2);
                    System.out.println(str);
                    break;
                default:
                    System.out.println("Wrong input Try Again");
            }
            if(c==1){
                break;
            }
        }

    }
    
    public static void main(String[] args){
        String[] replacement = {"Smartprix", "site", "india", "comparison", "best"};
        String[] argument = {"{}", "is", "{4}", "online", "{3}" ,"shopping", "{}", "in", "{}"};
        int c=0; String ans="";
        for(int i=0; i<argument.length; i++){
            
            if(argument[i].charAt(0) == '{' && argument[i].charAt(1) == '}'){
                ans += replacement[c] + " ";
                c++;
            }
             
            else if(argument[i].charAt(0) == '{' && argument[i].charAt(1) != '}'){
             int index = Integer.parseInt(argument[i].substring(1, argument[i].length()-1));
             ans += replacement[index] + " "; 
        }
            else{
                ans += argument[i] + " ";
            }
    }
        System.out.println(ans);
     
        parsing();
    }
    
    
}