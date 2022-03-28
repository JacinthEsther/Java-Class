package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class ExtractBalloon {
    public static void main(String[] args) {
        int minimum = Integer.MAX_VALUE;

        String word = "ABALLOONNOOLLABADACAEWBALLLOON";
        char[] input = {'B', 'A', 'L', 'O', 'N'};
        List<Integer> ints = new ArrayList<>();


          for (int i = 0; i < input.length; i++) {
            int count = 0;
            System.out.print(input[i] + " = ");
            for (int j = 0; j < word.length(); j++) {
                if (String.valueOf(word.charAt(j)).equalsIgnoreCase(String.valueOf(input[i]))) {
                    count++;

                }
            }
            ints.add(count);

            System.out.println(count);
        }
        for (int i = 0; i < ints.size(); i++) {
            if(minimum > ints.get(i)) {
                minimum = ints.get(i);
            }
        }
        System.out.println(ints);
        System.out.println(minimum);



    }
}
