/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;

/**
 *
 * @author Go
 */
public class encoder {
    
public static void main(String[] args){
    
    String[] raw = {"a", "b"};
    String[] code_words = {"1", "2", "3", "4"};
    Map<String, String> map = new HashMap<String, String>();
    for(int i=0;i<raw.length;i++){
        if(map.get(raw[i])==null)
          map.put(raw[i], code_words[i]);
    }
    String[] an = new String[raw.length];
    for(int i=0; i<raw.length; i++){
        an[i] = map.get(raw[i]);
    }
    
    for(int i=0; i<raw.length; i++){
        System.out.println(an[i]);
    }
}

}
