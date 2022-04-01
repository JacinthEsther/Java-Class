package chapterSixteen;

import java.util.*;

public class CountingLetters {
    public static void main(String[] args) {
Map<String, Integer> myMap = new HashMap<>();
createMap(myMap);
displayMap(myMap);
    }

    private static  void createMap(Map<String, Integer> map){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        String [] tokens = sentence.split("");

        for (int i = 0; i < tokens.length; i++) {

            String letter = tokens[i].toLowerCase();
            if (!tokens[i].startsWith(" ")) {

                if (map.containsKey(letter)) {
                    int count = map.get(letter);
                    map.put(letter, count + 1);
                } else {
                    map.put(letter, 1);
                }

            }
        }
        System.out.println(map);
    }

    private static void displayMap(Map<String, Integer>map){
        Set<String> keys = map.keySet();
        TreeSet<String> treeSet = new TreeSet<>(keys);

        System.out.printf("%nMap contains: %nKey\t\t\t\tValue%n");

        for(String key: treeSet){
            System.out.printf("%-10s%10s%n",key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty %b%n", map.size(),map.isEmpty());
    }
}
