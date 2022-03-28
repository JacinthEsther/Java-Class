package chapterFourteen;

public class LessonFourteen {
    public static void main(String[] args) {
        String s1 = "Happy Birthday";
        String s2 = "happy birthday";

        System.out.println(s1.compareTo(s2) );
        System.out.println(s1.regionMatches(0,s2,0,5));

        String [] strings = {"started", "starting", "ended", "ending"};

        for (String string: strings){
            if(string.startsWith("st")){
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
            if(string.endsWith("ed")){
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
            }
            if(string.startsWith("art",2)){
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }
    }
}
