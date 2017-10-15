/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Go
 */
public class mapShare {
    
    public static void main(String[] args){
     
       Map<String, String> map = new HashMap<String, String>();
       map.put("a", "aaa");
       map.put("b", "bbb");
       map.put("c", "ccc");
       if(map.get("a")!=null) {
        String ab = map.get("a");
        map.put("b", ab);
       }
       map.remove("c");
       System.out.println(map.get("a")+" " +map.get("b")+" "+map.get("c"));
    }
    
}
