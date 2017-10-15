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
public class wordLen {
  

public static void main(String[] args) {
  String[] str = {"a","bb","aaaa","b"};    
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i=0; i<str.length; i++)
   map.put(str[i], str[i].length());
  System.out.println(map.get("a")+" "+map.get("bb")+" "+map.get("aaaa"));
}
}