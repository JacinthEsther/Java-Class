package chapterSixteen;

import java.util.*;

public class DuplicateWordsCount {
    public static void main(String[] args) {
        System.out.println("The duplicated words are " +
                ""+returnNumberOfDuplicateWords("The boy is a boy a boy"));
    }
    public static int returnNumberOfDuplicateWords(String sentence){
        sentence = sentence.toLowerCase();
        String [] array = sentence.split(" ");
      Map<String, Integer> wordCount = new HashMap<>();
      for(String word : array){
          if(wordCount.containsKey(word)){
              int count = wordCount.get(word);
              wordCount.put(word, count+1);
          }
          else{wordCount.put(word, 1);}
      }
int count = 0;
      for(String key: wordCount.keySet()){
          if (wordCount.get(key)> 1){
              count++;
          }
      }
      return count;
    }
}
