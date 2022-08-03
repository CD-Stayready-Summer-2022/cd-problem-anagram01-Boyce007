package com.codedifferently;


import java.util.*;

public class Anagram01 {

    public static String[] problem(String inputWord, String[] inputWordList){
        // create hasmap
        // collect everyword along with letter count
        // loop thorught inputwordlist
        Map<Character,Integer> map = countLetters(inputWord);
        List<String> result = new ArrayList<>();
        int y = 0;
        for (int i = 0; i < inputWordList.length; i++) {
          Map<Character,Integer> currentWord = countLetters(inputWordList[i]);
          for (Character value: currentWord.keySet()) {
                if(!map.containsKey(value)) {
                    continue;
              }
              result.add(inputWordList[i]);
           }
        }


        return result.toArray(new String[0]);
    }


    public static Map<Character,Integer> countLetters(String inputWord) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < inputWord.length(); i++) {
            if(map.containsKey(inputWord.charAt(i))) {
                Integer value = map.get(inputWord.charAt(i)) + 1;
                map.put(inputWord.charAt(i),value);
            } else{
                map.put(inputWord.charAt(i),1);
            }
        }
        return map;
    }
}
