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
public class minesweeper {
    
  static void printMatrix(int[][] matr){
      for(int i=0;i<matr.length; i++){
          for(int j=0; j<matr[0].length; j++){
              System.out.print(matr[i][j]+"\t");
          }
          System.out.println();
      }
  }
   public static void main(String[] args){
       
       int[][] matrix={{0,  0,  0,  0,  0},
                       {0,  0,  0,  0,  0},
                       {1,  1,  1,  0,  0},
                       {1,  9,  1,  0,  0},
                       {1,  2,  2,  1,  0},
                       {0,  1,  9,  1,  0},
                       {0,  1,  1,  1,  0}
       };
       if(Math.sqrt(5)%1!=0)
            System.out.println(Math.sqrt(5));
   } 
   
}
