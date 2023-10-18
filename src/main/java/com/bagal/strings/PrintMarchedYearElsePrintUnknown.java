package com.bagal.strings;

import java.util.HashMap;
import java.util.Map;

/**
 Content of str1:
 "ccc ddd, 2005
 xxx yyy, 2010
 xxx zzz, 2015"

 Content of str2:
 "ccc ddd
 xxx zzz
 zzz kkk"

 White a function to take str1 and str2 as arguments, then print out the birth year for each entry in str2
 if found a matching record in str1, otherwise, print Unknown.

 ccc ddd     ==> print "2005"
 xxx zzz     ==> print "2015"
 zzz kkk     ==> print "Unknown"

 */

public class PrintMarchedYearElsePrintUnknown {
    public static void main(String[] args) {
        String str1 = "ccc ddd, 2005\n" +
                "        xxx yyy, 2010\n" +
                "        xxx zzz, 2015";
        String str2 = "ccc ddd\n" +
                " xxx zzz\n" +
                " zzz kkk";

        searchStringAndPrint(str1, str2);
    }
    static void searchStringAndPrint(String str1, String  str2){
        String [] str2Lines = str2.split("\n");
        Map<String,String> map = splitStringAndGetArrayOfString(str1);
        for(String name : str2Lines){
            name = name.trim();
            if(map.containsKey(name)){
                System.out.println(name+"=> "+map.get(name));
            }else {
                System.out.println(name+"=> unknown");
            }
        }

    }

    private static Map<String,String> splitStringAndGetArrayOfString(String str){
        String [] lines = str.split("\n");
        Map<String,String>map = new HashMap<>();
        for(String line : lines){
            String []w = line.split(",");
            map.put(w[0].trim(),w[1].trim());
        }
        return map;
    }

}
