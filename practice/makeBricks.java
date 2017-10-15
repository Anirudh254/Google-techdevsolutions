package practice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Go
 */
public class makeBricks {
    

   public static void main(String[] args){
   int small=3,big=1,goal=8;
       int i=1,t=1;
  if(goal<=small)
   System.out.println(true);
  else {
  while(i<=big){   
    if((goal >= (5*i)) && goal <= ((5*i) + small)){
     t=0;
   }
   i++;
  } 
  if(t==0)
   System.out.println(true);
  else
   System.out.println(false);
  }
  
  if(goal > big*5 + small)
      System.out.println(false);
  else if(goal%5 > small)
      System.out.println(false);
   else {
      System.out.println(true);
  } 
   
}
}

