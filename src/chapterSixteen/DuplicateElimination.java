package chapterSixteen;

import java.util.*;

public class DuplicateElimination {
    private static void eliminateDuplicateOf(Collection<String> firstName){
       Scanner userInput = new Scanner(System.in);
        Set<String> set = null;
        while(!Objects.equals(firstName, " ")) {
            System.out.println("enter your first name");
          set  = new HashSet<>(firstName);
        }
        for (String value: set){
            System.out.printf("%s ", value);
        }
    }
}
