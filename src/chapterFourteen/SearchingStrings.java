package chapterFourteen;

public class SearchingStrings {
    private static String inputWord;
    private static int count = 0;

    public static void main(String[] args) {

     count("StringBuilder", 'i');
     countWords();
    }
    private static int count(String word, char character){
        for (int i = 0; i < word.length(); i++) {
            if(String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(Character.valueOf(character)))){
                count++;
            }
        }
        System.out.println("The character count is "+count);
        return count;
    }
  private static void countWords() {
      String newWord = "StringBuilder";

      char[] letterAtIndex1 = {'A','B','C','D','F','G','H','I','J','K','L','M','N','O',
                                'P','Q','R','S','T','U','V','W','X','Y','Z'};

      for (char character : letterAtIndex1) {
          int count1 = 0;

          for (int j = 0; j < newWord.length(); j++) {
              if (String.valueOf(newWord.charAt(j)).equalsIgnoreCase(String.valueOf(character))) {
                  count1++;


              }
          }
          if (count1 > 0) {
              System.out.print(character + " = ");
              System.out.println(count1);
          }
      }



  }

}
