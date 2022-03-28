package classwork;


import java.util.ArrayList;


public class ReversedWord {
    private String string;

    public ReversedWord(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        String[] words = {"B", "A", "L", "L", "O", "O", "N"};
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }


        int x = 5;
        int y = 4;

        int newX = x + y - x;
        int newY = x + y - y;

        System.out.println(newX);
        System.out.println(newY);


        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " y is " + y);

        String newWord = "MISSISSIPPI";
        ArrayList<Integer> wordss = new ArrayList<>();

        for (int i = 0; i < newWord.length() - 1; i++) {
            if (String.valueOf(newWord.charAt(i)).equalsIgnoreCase("s")) {
                wordss.add(i);
            }
        }

        System.out.print(wordss);
        System.out.println();

        String input = "   chair   man  ";
        String newInput = input.replaceAll(" ", "");
        System.out.println(newInput);

        ReversedWord reversedWord = new ReversedWord("Sheer");
      int index= reversedWord. indexOf('e');
        System.out.println(index);
    }

       public int indexOf(char character){

           int index = -1;
           for (int i = 0; i < string.length(); i++) {
               if(string.charAt(i) == character){

                   index = i;
                   break;
               }
           }
           return  index;
       }
//        StringBuilder newWordss = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) != ' '){
//              newWordss.append(input.charAt(i));
//            }
//        }
//        System.out.println(newWordss);
    public int lastIndexOf(boolean shouldIgnoreCase,char character){
        int index = -1;
        string = string.toLowerCase();
        character = Character.toLowerCase(character);
        if (shouldIgnoreCase){
            for (int i = 0; i < string.length(); i++) {
               if (string.charAt(i)== character){
                   return i;
               }
               else {
                   lastIndexOf(character);
               }
            }
        }
        return  index;
    }

    private int lastIndexOf(char character) {


            int _lastIndex = -1;
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == character){

                    _lastIndex = i;

                }
            }
            return  _lastIndex;

    }

}
