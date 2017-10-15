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
public class Area {
    
     String[][] matrix= new String[25][25];
     public void area(){
         
         
         String path="R3U2R2D3L3D2L2U3";
         int a=11, b=11;
         for(int i=0; i<path.length(); i++){
             if(path.charAt(i)=='R'){
                 for(int j=0; j<Integer.parseInt(String.valueOf(path.charAt(i+1)));j++){
                     matrix[a][b] = "*";
                     b++;
                 }
                 i++;
             }
             
             if(path.charAt(i)=='U'){
                 for(int j=0; j<Integer.parseInt(String.valueOf(path.charAt(i+1)));j++){
                     matrix[a][b] = "*";
                     a++;
                 }
                 i++;
             }
             
             if(path.charAt(i)=='L'){
                 for(int j=0; j<Integer.parseInt(String.valueOf(path.charAt(i+1)));j++){
                     matrix[a][b] = "*";
                     b--;
                 }
                 i++;
             }
             
             if(path.charAt(i)=='D'){
                 for(int j=0; j<Integer.parseInt(String.valueOf(path.charAt(i+1)));j++){
                     matrix[a][b] = "*";
                     a--;
                 }
                 i++;
             }
         }
         
         for(int i=5; i<20; i++){
             for(int j=5; j<20; j++){
              System.out.print(matrix[i][j]+"\t");
             }
             System.out.println();
             }
         }
            
         public static void main(String[] args){
         Area neww = new Area();
         neww.area();
         }
         
         
     }

