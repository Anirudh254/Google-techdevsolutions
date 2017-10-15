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
public class pairs {
    
    
    
public static void main(String[] args) {
  String[] str = {"code","bug","hgg","dfgd"};    
  Map<String, String> map = new HashMap<String, String>();
  for(int i=0; i<str.length; i++)
   map.put(String.valueOf(str[i].charAt(0)), String.valueOf(str[i].charAt( str[i].length()-1 )));
    
  System.out.println(map.get("d"));
}
}