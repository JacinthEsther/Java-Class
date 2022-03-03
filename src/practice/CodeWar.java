package practice;

import java.util.*;

public class CodeWar {
    public static void main(String[] args) {
//       String newUserInput = "";
        String temp = " ";
        String newTemp = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String userInput = input.nextLine();
//        for (int i = 0; i < userInput.length() - 1; i++) {
//            newUserInput = userInput.replaceAll("([~!#@$%^&*()_+=-])", " ");
//            temp = newUserInput.substring(0, 1).toLowerCase() + newUserInput.substring(1);
//        }
//
//        for (int i = 0; i < temp.length() - 1; i++) {
//
//            if (Character.valueOf(temp.charAt(i)).equals(' ')&&i!=13) {
//
//                temp = temp.replace(temp.charAt(i+1), Character.toUpperCase(temp.charAt(i+1)));
//            }
//        }
//        newTemp=temp.replace(" ", "");
//        System.out.println(newTemp);
          String []newUserInput=  userInput.split("([~!#@$%^&*()_ +=-])");
          StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newUserInput.length; i++) {
            if(newUserInput[i].matches(newUserInput[0])){

                temp = newUserInput[0].replaceFirst("[A-Z]",newUserInput[0].substring(0, 1).toLowerCase() );
                sb.append(temp);
                continue;
            }
            newTemp= ""+newUserInput[i].toUpperCase().charAt(0);
          String newY= newUserInput[i].replaceFirst("[a-z]",newTemp);
          sb.append(newY);
        }
        System.out.println(sb);


    }

}
