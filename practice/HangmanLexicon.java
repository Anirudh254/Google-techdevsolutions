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
//import acm.util.*;
import java.util.*;
public class HangmanLexicon {
/** Returns the number of words in the lexicon. */
public int getWordCount() {
return 10;
}
/** Returns the word at the specified index. */
public String getWord(int index) {
switch (index) {
case 0: return "BUOY";
case 1: return "COMPUTER";
case 2: return "CONNOISSEUR";
case 3: return "DEHYDRATE";
case 4: return "FUZZY";
case 5: return "HUBBUB";
case 6: return "KEYHOLE";
case 7: return "QUAGMIRE";
case 8: return "SLITHER";
case 9: return "ZIRCON";
default: return "";//throw new ErrorException("getWord: Illegal index");
}
};

public static void main(String[] args){
    int n = (int)(10*Math.random());
    HangmanLexicon neww = new HangmanLexicon();
    Scanner in  = new Scanner(System.in);
    System.out.println("Welcome to Hangman!");
    String str = neww.getWord(n), adf=str;int gue = 8;
    int index=0;
    while(true){
        System.out.print("The word now looks like this: ");
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!='1')
            System.out.print("-");
           else
               System.out.print(adf.charAt(i));
        }
        System.out.println();
        if(gue==1)
          System.out.println("You have only one guess left.");
        else
          System.out.println("You have "+gue+" guesses left.");
        
        System.out.print("Your guess: ");
        String as = in.next();
        if(as.length()!=1){
            System.out.println("Incorrect Input Try again");
            continue;
        }
        char ch = as.charAt(0);
        ch = Character.toUpperCase(ch);
        if(adf.contains(String.valueOf(ch))){
            int t=0;
            index = 0;
            for(index = adf.indexOf(ch);index>=0;index=adf.indexOf(ch, index+1)){
                if(str.charAt(index)!='1'){
                t=1;
                    continue;
                }
            }
            if(t == 0){
                continue;
            }
        }
        if(str.contains(String.valueOf(ch))){
            int p = str.indexOf(ch);
            str = str.substring(0, p)+'1'+str.substring(p+1);
            System.out.println("That guess is correct.");
            int t=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!='1'){
                    t=1;
                }
            }
            if(t==0){
               System.out.println("You guessed the word: "+ adf);
               break;
            }
        }
        else{
            
            System.out.println("There are no "+ch+"'s in the word");
            gue--;
            if(gue==0){
                System.out.println("You are completely hung");
                System.out.println("The word was "+adf);
                break;
            }
            
        }
    }
    
}

}
