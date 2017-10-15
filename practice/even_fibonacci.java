/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Go
 */
public class even_fibonacci {
    
    static boolean isPrime(BigInteger n){
      /*  BigInteger c = new BigInteger("0");
        BigInteger c1 = n.divide(new BigInteger("2"));
       // System.out.println(c1);
        for(BigInteger i = new BigInteger("2"); i.compareTo(c1) <= 0; i = i.add(new BigInteger("1"))) {
            if(n.mod(i).equals(new BigInteger("0"))){
                c = new BigInteger("1");
                break;
            }
        }
        if(c.compareTo(new BigInteger("1")) == 0){
            return false;
        }
        else
            return true;
   */
      if(n.equals(new BigInteger("2")))
        return true;
      if(n.equals(new BigInteger("3")))
        return true;
      if(n.mod(new BigInteger("2")).equals(new BigInteger("0")))
        return false;
      if(n.mod(new BigInteger("3")).equals(new BigInteger("0")))
        return false;
    
    BigInteger i = new BigInteger("5");
    BigInteger w = new BigInteger("2");
    
    while(i.multiply(i).compareTo(n)<=0){
        if( n.mod(i).equals(new BigInteger("0")))
            return false;
        i = i.add(w);
        w = new BigInteger("6").subtract(w);
    }
    return true;
    }
    
    static int[] fibonacci(int max){
     
        int[] x=new int[max];
        x[0]=0; x[1]=1;
        for (int i = 2; x[i-1] < max; i++){
            x[i] = x[i-1] + x[i-2];
        } 
      return x;
    }
    
    
    public static boolean checkPal(int n){
        int n1 = n;
        int n2=0,c=0;
        for(int i=n1; i>0; i/=10){
            c++;
        }
        for(int i=(int)Math.pow(10,c-1);i>0;i/=10){
            n2 += (n1%10)*i;
            n1/=10;
        }
        if(n2==n)
            return true;
        else 
            return false;
    }
    public static void main(String[] args){
    
  //   System.out.println(isPrime(new BigInteger("7")));
     /*BigInteger lim = new BigInteger("600851475143");
     for(BigInteger i = new BigInteger("2"); i.compareTo(lim.divide(new BigInteger("2"))) == -1; i = i.add(new BigInteger("1"))){
       
           if(isPrime(i)){
             if(lim.mod(i).equals(new BigInteger("0"))){
              System.out.println(i);
             }
         }
     }
     
  */   
  
     System.out.println(checkPal(98411489));
     
     int[] ab = new int[10000];
     int c=0;
     for(int i=999; i>99; i--){
        for(int j=999; j>99; j--){
          if(checkPal(i*j)){
          ab[c] = i*j;
          c++;
          }
        }
     }
     Arrays.sort(ab);
     System.out.println(ab[9999]);
  /*
        int[] ab = new int[4000];
      ab=fibonacci(4000000);
      int sum = 0;
      
      for(int i=1; i<50; i++){
          if(ab[i]%2 == 0) 
              sum += ab[i];
      }
      
      System.out.println(sum);
      System.out.println();
     
    int x=1,y=2,sum,limit;     //Here value of first 2 terms have been initialized as 1 and 2
    int evensum=2;             //Since in calculation, we omit 2 which is an even number
    limit = 50;
    while( (x+y)<limit ) {
        sum=x+y;
        x=y;
        y=sum;
        if (sum%2==0)
            evensum+=sum;
    }
    System.out.println(evensum);
*/  
     
     }
    
}
