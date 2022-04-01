package chapterSeven;

import java.util.Random;

public class PasswordGeneration {
    public static void main(String[] args) {
        String[] arrayy = new String[12];
        Random randomNumbers = new Random();
        String getPassword = "";
        char [] password= {'A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] password2= {'0','1','2','3','4','5','6','7','8','9'};


        for(int i = 0; i <4;i++){
            arrayy[i] = String.valueOf(password[randomNumbers.nextInt(26)]);
        }

        for (int i = 4; i < 8; i++) {
            arrayy[i] = String.valueOf(password2[randomNumbers.nextInt(10)]);
        }
        for (int i = 8; i <12 ; i++) {
            arrayy[i] = String.valueOf(password[randomNumbers.nextInt(26)]).toLowerCase();
        }

        for(int a = 0; a < arrayy.length; a++){
            getPassword += arrayy[randomNumbers.nextInt(12)];
        }

        System.out.println(getPassword);
    }
}
