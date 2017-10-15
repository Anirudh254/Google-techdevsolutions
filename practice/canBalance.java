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
public class canBalance {
    
    
    public static void main(String[] args){
    
        int[] nums = {1, 1, 1, 2, 1};
        int l=0,r=0,p=0;
        boolean aa=false;
        for(int i=0; i<nums.length; i++){
            l=0;r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int k=i;k<nums.length;k++){
                r+=nums[k];
            }
            if(l==r){
                aa=true;
            }
        }
        System.out.print(aa);
    }
}
