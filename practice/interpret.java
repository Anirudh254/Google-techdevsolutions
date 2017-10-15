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
public class interpret {
    
    public static void main(String[] args){
      int value = 4; String[] commands = {"-", "aed"}; int[] arg = {2};
    
    for(int i=0; i<commands.length; i++){
        switch(commands[i]){
            case "+":
                value = value + arg[i];
                break;
            case "*":
                value = value * arg[i];
                break;
            case "-":
                value = value - arg[i];
                break;
            default:
                value = -1;
                break;
        }
        if(value == -1)
            break;
      }
    System.out.println(value);
    
    }
}
