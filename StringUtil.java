package com.company;

public class StringUtil{
    public static String reverse(String str){
        return new StringBuffer(str).reverse().toString();
    }
    public static boolean isPalindrome(String str){
        //unholy abomination
        String str1 = 
str.toLowerCase().replace(".","").replace("'","").replace(",","").replace(" 
","");
        return str1.equals(reverse(str1));
    }

    public static String pigLatinizeHelper(String english){
        char first = english.charAt(0);
        if (!english.contains("a") && !english.contains("e") && 
!english.contains("i") && !english.contains("o") && 
!english.contains("u")){
            return english + "ay";
        }
        else if (first == 'a' || first == 'e' || first == 'i' || first 
== 'o' || first == 'u'){
            return english + "yay";
        }
        else{
            char start = english.charAt(0);
            return english.substring(1,english.length()) + start + "ay";
        }
    }

    public static String pigLatinize(String english){
        String[] wordsList = english.split(" ");
        String latinWords = "";

        for (int i = 0; i < wordsList.length; i++){
            latinWords += ( " " + pigLatinizeHelper(wordsList[i]));
        }
        return latinWords.toString();
    }
}

